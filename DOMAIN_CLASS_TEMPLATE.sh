#!/bin/bash
#
# DOMAIN CLASS REFACTORING TEMPLATE
# Copy-paste this template and adapt for each domain class
#

# BEFORE (Remove this):
# @EntityScan
# public class ClassName {
#     @Id
#     private String id;
#     private String field1;
#     private int field2;
#     // No @Column annotations
#     // No validation annotations
#     // No equals/hashCode
#
# AFTER (Replace with this):

cat > DomainClassTemplate.java << 'EOF'
package za.ac.cputassignment.domain.{category};

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Objects;

@Entity
@Table(name = "table_name", uniqueConstraints = {
        @UniqueConstraint(columnNames = "uniqueField")
})
public class ClassName {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false, unique = true, length = 50)
    @NotBlank(message = "Unique field is required")
    private String uniqueField;

    @Column(nullable = false, length = 50)
    @NotBlank(message = "Field1 is required")
    @Size(min = 2, max = 50, message = "Field1 must be 2-50 characters")
    private String field1;

    @Column(nullable = true, length = 100)
    private String field2;

    @Column(nullable = false)
    @Min(value = 1, message = "Must be positive")
    private int field3;

    // Constructors (keep private, use builder)
    private ClassName() {
    }

    private ClassName(Builder builder) {
        this.uniqueField = builder.uniqueField;
        this.field1 = builder.field1;
        this.field2 = builder.field2;
        this.field3 = builder.field3;
    }

    // Getters and setters for all fields
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUniqueField() {
        return uniqueField;
    }

    public String getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public int getField3() {
        return field3;
    }

    // Builder pattern (keep existing)
    public static class Builder {
        private String uniqueField;
        private String field1;
        private String field2;
        private int field3;

        public Builder uniqueField(String uniqueField) {
            this.uniqueField = uniqueField;
            return this;
        }

        public Builder field1(String field1) {
            this.field1 = field1;
            return this;
        }

        public Builder field2(String field2) {
            this.field2 = field2;
            return this;
        }

        public Builder field3(int field3) {
            this.field3 = field3;
            return this;
        }

        public Builder copy(ClassName other) {
            this.uniqueField = other.uniqueField;
            this.field1 = other.field1;
            this.field2 = other.field2;
            this.field3 = other.field3;
            return this;
        }

        public ClassName build() {
            return new ClassName(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassName that = (ClassName) o;
        return uniqueField.equals(that.uniqueField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueField);
    }

    @Override
    public String toString() {
        return "ClassName{" +
                "id='" + id + '\'' +
                ", uniqueField='" + uniqueField + '\'' +
                ", field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                ", field3=" + field3 +
                '}';
    }
}
EOF

echo "Template created and saved"
echo ""
echo "STEPS TO APPLY TEMPLATE:"
echo "1. Replace {category} with location, transport, person, or eventTrigger"
echo "2. Replace 'ClassName' with actual class name"
echo "3. Replace 'table_name' with actual table name (snake_case)"
echo "4. Replace 'uniqueField' with actual unique identifier field"
echo "5. Replace field1, field2, field3 with actual fields"
echo "6. Adjust @Column constraints based on actual requirements"
echo "7. Add appropriate validation annotations"
echo "8. Make sure builder methods match field names"
echo "9. Run: mvn clean compile to verify no errors"
