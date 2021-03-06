/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.includes.includes;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;

import static com.google.common.base.MoreObjects.toStringHelper;

@ThriftStruct("Included")
public final class Included
{
    @ThriftConstructor
    public Included(
        @ThriftField(value=1, name="MyIntField", requiredness=Requiredness.NONE) final long myIntField,
        @ThriftField(value=2, name="MyTransitiveField", requiredness=Requiredness.NONE) final test.fixtures.includes.transitive.Foo myTransitiveField
    ) {
        this.myIntField = myIntField;
        this.myTransitiveField = myTransitiveField;
    }

    public static class Builder {
        private long myIntField;

        public Builder setMyIntField(long myIntField) {
            this.myIntField = myIntField;
            return this;
        }
        private test.fixtures.includes.transitive.Foo myTransitiveField;

        public Builder setMyTransitiveField(test.fixtures.includes.transitive.Foo myTransitiveField) {
            this.myTransitiveField = myTransitiveField;
            return this;
        }

        public Builder() { }
        public Builder(Included other) {
            this.myIntField = other.myIntField;
            this.myTransitiveField = other.myTransitiveField;
        }

        public Included build() {
            return new Included (
                this.myIntField,
                this.myTransitiveField
            );
        }
    }

    private final long myIntField;

    @ThriftField(value=1, name="MyIntField", requiredness=Requiredness.NONE)
    public long getMyIntField() { return myIntField; }

    private final test.fixtures.includes.transitive.Foo myTransitiveField;

    @ThriftField(value=2, name="MyTransitiveField", requiredness=Requiredness.NONE)
    public test.fixtures.includes.transitive.Foo getMyTransitiveField() { return myTransitiveField; }

    @Override
    public String toString()
    {
        return toStringHelper(this)
            .add("myIntField", myIntField)
            .add("myTransitiveField", myTransitiveField)
            .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Included other = (Included)o;

        return
            Objects.equals(myIntField, other.myIntField) &&
            Objects.equals(myTransitiveField, other.myTransitiveField);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            myIntField,
            myTransitiveField
        });
    }
}
