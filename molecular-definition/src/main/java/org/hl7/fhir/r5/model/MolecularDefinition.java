package org.hl7.fhir.r5.model;
//package org.hl7.fhir.r5.model;


import ca.uhn.fhir.model.api.annotation.Block;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Demographics and other administrative information about an individual or animal receiving care or other health-related services.
 */
@ResourceDef(name = "MolecularDefinition", profile = "http://hl7.org/fhir/StructureDefinition/MolecularDefinition")
public class MolecularDefinition extends DomainResource {

    @Block()
    public static class MolecularDefinitionCoordinateSystemComponent extends BackboneElement implements IBaseBackboneElement {

        /**
         * A definition of the coordinate system. Examples include 1-based character counting, and 0-based interval counting.
         */
        @Child(name = "system", type = {CodeableConcept.class}, order = 0, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "The type of coordinate system used", formalDefinition = "A definition of the coordinate system. Examples include 1-based character counting, and 0-based interval counting.")
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "https://fhir.loinc.org/ValueSet/LL5323-2")
        protected CodeableConcept system;

        /**
         * The location of the origin (0 or 1, depending on the coordinate system). For example, this could specify the origin is at the start of the sequence (e.g., 5’ end or N-terminus), the beginning of a designated feature (e.g., A in the ATG translation initiation codon), or the end of a designated feature (e.g., 3’ end of an exon, from which an offset is calculated into the following intron).
         */
        @Child(name = "origin", type = {CodeableConcept.class}, order = 1, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "The location of the origin of the coordinate system", formalDefinition = "The location of the origin (0 or 1, depending on the coordinate system). For example, this could specify the origin is at the start of the sequence (e.g., 5’ end or N-terminus), the beginning of a designated feature (e.g., A in the ATG translation initiation codon), or the end of a designated feature (e.g., 3’ end of an exon, from which an offset is calculated into the following intron).")
        protected CodeableConcept origin;

        /**
         * The normalization method used for determining a location within the coordinate system. Examples include left shift (e.g., VCF), right shift (e.g., HGVS), or fully justified (e.g., VOCA).
         */
        @Child(name = "normalizationMethod", type = {CodeableConcept.class}, order = 2, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "The normalization method used for determining a location within the coordinate system", formalDefinition = "The normalization method used for determining a location within the coordinate system. Examples include left shift (e.g., VCF), right shift (e.g., HGVS), or fully justified (e.g., VOCA).")
        protected CodeableConcept normalizationMethod;

        private static final long serialVersionUID = 127464494L;

        /**
         * Constructor
         */
        public MolecularDefinitionCoordinateSystemComponent() {
            super();
        }

        /**
         * @return {@link #system} (The type of coordinate system used.)
         */
        public CodeableConcept getSystem() {
            if (this.system == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create CoordinateSystem.system");
                else if (Configuration.doAutoCreate())
                    this.system = new CodeableConcept(); // cc
            return this.system;
        }

        public boolean hasSystem() {
            return this.system != null && !this.system.isEmpty();
        }

        /**
         * @param value {@link #system} (The type of coordinate system used.)
         */
        public MolecularDefinitionCoordinateSystemComponent setSystem(CodeableConcept value) {
            this.system = value;
            return this;
        }

        /**
         * @return {@link #origin} (The location of the origin of the coordinate system)
         */
        public CodeableConcept getOrigin() {
            if (this.origin == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create CoordinateSystem.origin");
                else if (Configuration.doAutoCreate())
                    this.origin = new CodeableConcept(); // cc
            return this.origin;
        }

        public boolean hasOrigin() {
            return this.origin != null && !this.origin.isEmpty();
        }

        /**
         * @param value {@link #origin} (The location of the origin of the coordinate system.)
         */
        public MolecularDefinitionCoordinateSystemComponent setOrigin(CodeableConcept value) {
            this.origin = value;
            return this;
        }

        /**
         * @return {@link #normalizationMethod} (The normalization method used for determining a location within the coordinate system.)
         */
        public CodeableConcept getNormalizationMethod() {
            if (this.normalizationMethod == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create CoordinateSystem.normalizationMethod");
                else if (Configuration.doAutoCreate())
                    this.normalizationMethod = new CodeableConcept(); // cc
            return this.normalizationMethod;
        }

        public boolean hasNormalizationMethod() {
            return this.normalizationMethod != null && !this.normalizationMethod.isEmpty();
        }

        /**
         * @param value {@link #normalizationMethod} (The normalization method used for determining a location within the coordinate system.)
         */
        public MolecularDefinitionCoordinateSystemComponent setNormalizationMethod(CodeableConcept value) {
            this.normalizationMethod = value;
            return this;
        }

        protected void listChildren(List<Property> children) {
            super.listChildren(children);
            children.add(new Property("system", "CodeableConcept", "The type of coordinate system used.", 0, 1, system));
            children.add(new Property("origin", "CodeableConcept", "The location of the origin of the coordinate system.", 0, 1, origin));
            children.add(new Property("normalizationMethod", "CodeableConcept", "The normalization method used for determining a location within the coordinate system.", 0, 1, normalizationMethod));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
            switch (_hash) {
                case -887328209: /*system*/
                    return new Property("system", "CodeableConcept", "The type of coordinate system used.", 0, 1, system);
                case -1008619738: /*origin*/
                    return new Property("origin", "CodeableConcept", "The location of the origin of the coordinate system.", 0, 1, origin);
                case -1609738018: /*normalizationMethod*/
                    return new Property("normalizationMethod", "CodeableConcept", "The normalization method used for determining a location within the coordinate system.", 0, 1, normalizationMethod);
                default:
                    return super.getNamedProperty(_hash, _name, _checkValid);
            }
        }

        @Override
        public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
            switch (hash) {
                case -887328209: /*system*/
                    return this.system == null ? new Base[0] : new Base[]{this.system}; // CodeableConcept
                case -1008619738: /*origin*/
                    return this.origin == null ? new Base[0] : new Base[]{this.origin}; // CodeableConcept
                case -1609738018: /*normalizationMethod*/
                    return this.normalizationMethod == null ? new Base[0] : new Base[]{this.normalizationMethod}; // CodeableConcept
                default:
                    return super.getProperty(hash, name, checkValid);
            }

        }

        @Override
        public Base setProperty(int hash, String name, Base value) throws FHIRException {
            switch (hash) {
                case -887328209: // system
                    this.system = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
                    return value;
                case -1008619738: // origin
                    this.origin = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
                    return value;
                case -1609738018: // normalizationMethod
                    this.normalizationMethod = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
                    return value;
                default:
                    return super.setProperty(hash, name, value);
            }

        }

        @Override
        public Base setProperty(String name, Base value) throws FHIRException {
            if (name.equals("system")) {
                this.system = TypeConvertor.castToCodeableConcept(value); // HumanName
            } else if (name.equals("origin")) {
                this.origin = TypeConvertor.castToCodeableConcept(value); // Address
            } else if (name.equals("normalizationMethod")) {
                this.normalizationMethod = TypeConvertor.castToCodeableConcept(value); // Reference
            } else
                return super.setProperty(name, value);
            return value;
        }

        @Override
        public void removeChild(String name, Base value) throws FHIRException {
            if (name.equals("system")) {
                this.system = null;
            } else if (name.equals("origin")) {
                this.origin = null;
            } else if (name.equals("normalizationMethod")) {
                this.normalizationMethod = null;
            } else
                super.removeChild(name, value);

        }

        @Override
        public Base makeProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case -887328209:
                    return getSystem();
                case -1008619738:
                    return getOrigin();
                case -1609738018:
                    return getNormalizationMethod();
                default:
                    return super.makeProperty(hash, name);
            }

        }

        @Override
        public String[] getTypesForProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case -887328209: /*relationship*/
                    return new String[]{"CodeableConcept"};
                case -1008619738: /*relationship*/
                    return new String[]{"CodeableConcept"};
                case -1609738018: /*relationship*/
                    return new String[]{"CodeableConcept"};
                default:
                    return super.getTypesForProperty(hash, name);
            }

        }

        @Override
        public Base addChild(String name) throws FHIRException {
            if (name.equals("system")) {
                this.system = new CodeableConcept();
                return this.system;
            } else if (name.equals("origin")) {
                this.origin = new CodeableConcept();
                return this.origin;
            } else if (name.equals("normalizationMethod")) {
                this.normalizationMethod = new CodeableConcept();
                return this.normalizationMethod;
            } else
                return super.addChild(name);
        }

        public MolecularDefinitionCoordinateSystemComponent copy() {
            MolecularDefinitionCoordinateSystemComponent dst = new MolecularDefinitionCoordinateSystemComponent();
            copyValues(dst);
            return dst;
        }

        public void copyValues(MolecularDefinitionCoordinateSystemComponent dst) {
            super.copyValues(dst);
            dst.system = system == null ? null : system.copy();
            dst.origin = origin == null ? null : origin.copy();
            dst.normalizationMethod = normalizationMethod == null ? null : normalizationMethod.copy();
        }

        @Override
        public boolean equalsDeep(Base other_) {
            if (!super.equalsDeep(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionCoordinateSystemComponent))
                return false;
            MolecularDefinitionCoordinateSystemComponent o = (MolecularDefinitionCoordinateSystemComponent) other_;
            return compareDeep(system, o.system, true) && compareDeep(origin, o.origin, true) && compareDeep(normalizationMethod, o.normalizationMethod, true);
        }

        @Override
        public boolean equalsShallow(Base other_) {
            return equalsDeep(other_);
        }

        public boolean isEmpty() {
            return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(system, origin, normalizationMethod);
        }

        public String fhirType() {
            return "MolecularDefinition.location.sequenceLocation.coordinateInterval.coordinateSystem";

        }

    }

    @Block()
    public static class MolecularDefinitionCoordinateIntervalComponent extends BackboneElement implements IBaseBackboneElement {

        /**
         * A definition of the coordinate system. Examples include 1-based character counting, and 0-based interval counting.
         */
        @Child(name = "coordinateSystem", type = {MolecularDefinitionCoordinateSystemComponent.class}, order = 0, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "The type of coordinate system used", formalDefinition = "A definition of the coordinate system. Examples include 1-based character counting, and 0-based interval counting.")
        protected MolecularDefinitionCoordinateSystemComponent coordinateSystem;

        /**
         * The start location of the interval.
         */
        @Child(name = "start", type = {Quantity.class, Range.class}, order = 1, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "The start location of the interval", formalDefinition = "The start location of the interval expressed as a precise coordinate (Quantity) or expressed as a range (Range) that is defined by low (range start) and high (range end). Open-ended ranges, where one end is unbounded, may be supported.")
        protected DataType start;

        /**
         * The end location of the interval.
         */
        @Child(name = "end", type = {Quantity.class, Range.class}, order = 2, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "The start location of the interval", formalDefinition = "The end location of the interval expressed as a precise coordinate (Quantity) or as a range (Range) that is defined by low (range start) and high (range end). Open-ended ranges, where one end is unbounded, may be supported.")
        protected DataType end;

        private static final long serialVersionUID = 1234214494L;

        /**
         * Constructor
         */
        public MolecularDefinitionCoordinateIntervalComponent() {
            super();
        }

        /**
         * @return {@link #coordinateSystem} (The coordinate system used to define the location.)
         */
        public MolecularDefinitionCoordinateSystemComponent getCoordinateSystem() {
            if (this.coordinateSystem == null) {
                this.coordinateSystem = new MolecularDefinitionCoordinateSystemComponent(); // Instantiate if null
            }
            return this.coordinateSystem;
        }

        public boolean hasCoordinateSystem() {
            return this.coordinateSystem != null && !this.coordinateSystem.isEmpty();
        }

        /**
         * @param value {@link #coordinateSystem} (The coordinate system used to define the location.)
         */
        public MolecularDefinitionCoordinateIntervalComponent setCoordinateSystem(MolecularDefinitionCoordinateSystemComponent value) {
            this.coordinateSystem = value;
            return this; // Enable method chaining
        }

        /**
         * @return {@link #start} (The start location of the interval.)
         */
        public DataType getStart() {
            return this.start;
        }

        /**
         * @return {@link #start} (The start location of the interval.)
         */
        public Quantity getStartQuantity() throws FHIRException {
            if (this.start == null)
                this.start = new Quantity();
            if (!(this.start instanceof Quantity))
                throw new FHIRException("Type mismatch: the type Quantity was expected, but " + this.start.getClass().getName() + " was encountered");
            return (Quantity) this.start;
        }

        public boolean hasStartQuantity() {
            return this != null && this.start instanceof Quantity;
        }

        /**
         * @return {@link #start} (The start location of the interval.)
         */
        public DateTimeType getStartRange() throws FHIRException {
            if (this.start == null)
                this.start = new Range();
            if (!(this.start instanceof Range))
                throw new FHIRException("Type mismatch: the type Range was expected, but " + this.start.getClass().getName() + " was encountered");
            return (DateTimeType) this.start;
        }

        public boolean hasStartRangeType() {
            return this != null && this.start instanceof Range;
        }

        public boolean hasStart() {
            return this.start != null && !this.start.isEmpty();
        }

        /**
         * @param value {@link #start} (The start location of the interval.)
         */
        public MolecularDefinitionCoordinateIntervalComponent setStart(DataType value) {
            if (value != null && !(value instanceof Quantity || value instanceof Range))
                throw new FHIRException("Not the right type for Patient.start[x]: " + value.fhirType());
            this.start = value;
            return this;
        }

        /**
         * @return {@link #end} (The end location of the interval.)
         */
        public DataType getEnd() {
            return this.end;
        }

        /**
         * @return {@link #end} (The end location of the interval as a Quantity.)
         */
        public Quantity getEndQuantity() throws FHIRException {
            if (this.end == null)
                this.end = new Quantity();
            if (!(this.end instanceof Quantity))
                throw new FHIRException("Type mismatch: the type Quantity was expected, but " + this.end.getClass().getName() + " was encountered");
            return (Quantity) this.end;
        }

        public boolean hasEndQuantity() {
            return this.end != null && this.end instanceof Quantity;
        }

        /**
         * @return {@link #end} (The end location of the interval as a Range.)
         */
        public Range getEndRange() throws FHIRException {
            if (this.end == null)
                this.end = new Range();
            if (!(this.end instanceof Range))
                throw new FHIRException("Type mismatch: the type Range was expected, but " + this.end.getClass().getName() + " was encountered");
            return (Range) this.end;
        }

        public boolean hasEndRangeType() {
            return this.end != null && this.end instanceof Range;
        }

        public boolean hasEnd() {
            return this.end != null && !this.end.isEmpty();
        }

        /**
         * @param value {@link #end} (The end location of the interval.)
         */
        public MolecularDefinitionCoordinateIntervalComponent setEnd(DataType value) {
            if (value != null && !(value instanceof Quantity || value instanceof Range))
                throw new FHIRException("Not the right type for MolecularDefinitionCoordinateIntervalComponent.end[x]: " + value.fhirType());
            this.end = value;
            return this;
        }

        @Override
        protected void listChildren(List<Property> children) {
            super.listChildren(children);
            children.add(new Property("coordinateSystem", "MolecularDefinitionCoordinateSystemComponent", "The type of coordinate system used.", 0, 1, coordinateSystem));
            children.add(new Property("start", "Quantity|Range", "The start location of the interval.", 0, 1, start));
            children.add(new Property("end", "Quantity|Range", "The end location of the interval.", 0, 1, end));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
            switch (_hash) {
                case -1618432855: /*coordinateSystem*/
                    return new Property("coordinateSystem", "MolecularDefinitionCoordinateSystemComponent", "The type of coordinate system used.", 0, 1, coordinateSystem);
                case -1724546052: /*start*/
                    return new Property("start", "Quantity|Range", "The start location of the interval.", 0, 1, start);
                case 2065205984: /*end*/
                    return new Property("end", "Quantity|Range", "The end location of the interval.", 0, 1, end);
                default:
                    return super.getNamedProperty(_hash, _name, _checkValid);
            }
        }

        @Override
        public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
            switch (hash) {
                case -1618432855: /*coordinateSystem*/
                    return this.coordinateSystem == null ? new Base[0] : new Base[]{this.coordinateSystem}; // MolecularDefinitionCoordinateSystemComponent
                case -1724546052: /*start*/
                    return this.start == null ? new Base[0] : new Base[]{this.start}; // DataType
                case 2065205984: /*end*/
                    return this.end == null ? new Base[0] : new Base[]{this.end}; // DataType
                default:
                    return super.getProperty(hash, name, checkValid);
            }
        }

        @Override
        public Base setProperty(int hash, String name, Base value) throws FHIRException {
            switch (hash) {
                case -1618432855: // coordinateSystem
                    this.coordinateSystem = (MolecularDefinitionCoordinateSystemComponent) value; // MolecularDefinitionCoordinateSystemComponent
                    return value;
                case -1724546052: // start
                    this.start = TypeConvertor.castToType(value); // DataType
                    return value;
                case 2065205984: // end
                    this.end = TypeConvertor.castToType(value); // DataType
                    return value;
                default:
                    return super.setProperty(hash, name, value);
            }
        }

        @Override
        public Base setProperty(String name, Base value) throws FHIRException {
            if (name.equals("coordinateSystem")) {
                this.coordinateSystem = (MolecularDefinitionCoordinateSystemComponent) value; // MolecularDefinitionCoordinateSystemComponent
            } else if (name.equals("start")) {
                this.start = TypeConvertor.castToType(value); // DataType
            } else if (name.equals("end")) {
                this.end = TypeConvertor.castToType(value); // DataType
            } else {
                return super.setProperty(name, value);
            }
            return value;
        }

        @Override
        public void removeChild(String name, Base value) throws FHIRException {
            if (name.equals("coordinateSystem")) {
                this.coordinateSystem = null;
            } else if (name.equals("start")) {
                this.start = null;
            } else if (name.equals("end")) {
                this.end = null;
            } else {
                super.removeChild(name, value);
            }
        }

        @Override
        public Base makeProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case -1618432855:
                    return getCoordinateSystem();
                case -1724546052:
                    return getStart();
                case 2065205984:
                    return getEnd();
                default:
                    return super.makeProperty(hash, name);
            }
        }

        @Override
        public String[] getTypesForProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case -1618432855: /*coordinateSystem*/
                    return new String[]{"MolecularDefinitionCoordinateSystemComponent"};
                case -1724546052: /*start*/
                    return new String[]{"Quantity", "Range"};
                case 2065205984: /*end*/
                    return new String[]{"Quantity", "Range"};
                default:
                    return super.getTypesForProperty(hash, name);
            }
        }

        @Override
        public Base addChild(String name) throws FHIRException {
            if (name.equals("coordinateSystem")) {
                this.coordinateSystem = new MolecularDefinitionCoordinateSystemComponent();
                return this.coordinateSystem;
            } else if (name.equals("start")) {
                this.start = new Quantity();
                return this.start;
            } else if (name.equals("end")) {
                this.end = new Quantity();
                return this.end;
            } else {
                return super.addChild(name);
            }
        }

        public void copyValues(MolecularDefinitionCoordinateIntervalComponent dst) {
            super.copyValues(dst);
            if (dst instanceof MolecularDefinitionCoordinateIntervalComponent) {
                MolecularDefinitionCoordinateIntervalComponent target = (MolecularDefinitionCoordinateIntervalComponent) dst;
                target.coordinateSystem = this.coordinateSystem == null ? null : this.coordinateSystem.copy();
                target.start = this.start == null ? null : this.start.copy();
                target.end = this.end == null ? null : this.end.copy();
            }
        }

        @Override
        public boolean equalsDeep(Base other_) {
            if (!super.equalsDeep(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionCoordinateIntervalComponent))
                return false;
            MolecularDefinitionCoordinateIntervalComponent o = (MolecularDefinitionCoordinateIntervalComponent) other_;
            return compareDeep(coordinateSystem, o.coordinateSystem, true) &&
                    compareDeep(start, o.start, true) &&
                    compareDeep(end, o.end, true);
        }

        @Override
        public boolean equalsShallow(Base other_) {
            if (!super.equalsShallow(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionCoordinateIntervalComponent))
                return false;
            MolecularDefinitionCoordinateIntervalComponent o = (MolecularDefinitionCoordinateIntervalComponent) other_;
            return true;
        }

        @Override
        public boolean isEmpty() {
            return super.isEmpty() &&
                    (coordinateSystem == null || coordinateSystem.isEmpty()) &&
                    (start == null || start.isEmpty()) &&
                    (end == null || end.isEmpty());
        }

        @Override
        public String fhirType() {
            return "MolecularDefinitionCoordinateIntervalComponent";
        }

        public MolecularDefinitionCoordinateIntervalComponent copy() {
            MolecularDefinitionCoordinateIntervalComponent dst = new MolecularDefinitionCoordinateIntervalComponent();
            copyValues(dst);
            return dst;
        }
    }

    @Block
    public static class MolecularDefinitionLocationSequenceLocationComponent extends BackboneElement implements IBaseBackboneElement {

        /**
         * A reference to a sequence on which the location is defined.
         */
        @Child(name = "sequenceContext", type = {MolecularDefinition.class}, order = 0, min = 1, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "The sequence on which the location is defined", formalDefinition = "A reference to a sequence on which the location is defined.")
        protected Reference sequenceContext;

        /**
         * An interval on a sequence, defined by coordinate-based start and end coordinates.
         */
        @Child(name = "coordinateInterval", type = {MolecularDefinitionCoordinateIntervalComponent.class}, order = 1, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "An interval on a sequence", formalDefinition = "An interval on a sequence, defined by coordinate-based start and end coordinates.")
        protected MolecularDefinitionCoordinateIntervalComponent coordinateInterval;

        /**
         * A definition of the coordinate system. Examples include 1-based character counting, and 0-based interval counting.
         */
        @Child(name = "strand", type = {CodeableConcept.class}, order = 2, min = 0, max = 1, modifier = false, summary = false)
        @Description(shortDefinition = "The strand at the coordinateInterval", formalDefinition = "The specific strand at the coordinateInterval, when the interval alone is not sufficient to define a location (e.g., double stranded DNA). Example values include 'forward' and 'reverse'.")
        protected CodeableConcept strand;

        private static final long serialVersionUID = 7243214494L;

        /**
         * Constructor
         */
        public MolecularDefinitionLocationSequenceLocationComponent() {
            super();
        }

        /**
         * @return {@link #sequenceContext} (The sequence context for defining the location.)
         */
        public Reference getSequenceContext() {
            if (this.sequenceContext == null) {
                this.sequenceContext = new Reference(); // Instantiate if null
            }
            return this.sequenceContext;
        }

        /**
         * @param value {@link #sequenceContext} (The sequence context for defining the location.)
         */
        public MolecularDefinitionLocationSequenceLocationComponent setSequenceContext(Reference value) {
            this.sequenceContext = value;
            return this; // Enable method chaining
        }

        public boolean hasSequenceContext() {
            return this.sequenceContext != null && !this.sequenceContext.isEmpty();
        }

        /**
         * @return {@link #coordinateInterval} (The interval defined by the coordinate.)
         */
        public MolecularDefinitionCoordinateIntervalComponent getCoordinateInterval() {
            if (this.coordinateInterval == null) {
                this.coordinateInterval = new MolecularDefinitionCoordinateIntervalComponent(); // Instantiate if null
            }
            return this.coordinateInterval;
        }

        /**
         * @param value {@link #coordinateInterval} (The interval defined by the coordinate.)
         */
        public MolecularDefinitionLocationSequenceLocationComponent setCoordinateInterval(MolecularDefinitionCoordinateIntervalComponent value) {
            this.coordinateInterval = value;
            return this; // Enable method chaining
        }

        public boolean hasCoordinateInterval() {
            return this.coordinateInterval != null && !this.coordinateInterval.isEmpty();
        }

        /**
         * @return {@link #strand} (Specifies the strand on which the location sequence resides.)
         */
        public CodeableConcept getStrand() {
            if (this.strand == null) {
                this.strand = new CodeableConcept(); // Instantiate if null
            }
            return this.strand;
        }

        /**
         * @param value {@link #strand} (Specifies the strand on which the location sequence resides.)
         */
        public MolecularDefinitionLocationSequenceLocationComponent setStrand(CodeableConcept value) {
            this.strand = value;
            return this; // Enable method chaining
        }

        public boolean hasStrand() {
            return this.strand != null && !this.strand.isEmpty();
        }

        @Override
        protected void listChildren(List<Property> children) {
            super.listChildren(children);
            children.add(new Property("sequenceContext", "Reference", "The sequence context for defining the location.", 0, 1, sequenceContext));
            children.add(new Property("coordinateInterval", "MolecularDefinitionCoordinateIntervalComponent", "The interval defined by the coordinate.", 0, 1, coordinateInterval));
            children.add(new Property("strand", "CodeableConcept", "Specifies the strand on which the location sequence resides.", 0, 1, strand));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
            switch (_hash) {
                case -1618432855: /*sequenceContext*/
                    return new Property("sequenceContext", "Reference", "The sequence context for defining the location.", 0, 1, sequenceContext);
                case -1724546052: /*coordinateInterval*/
                    return new Property("coordinateInterval", "MolecularDefinitionCoordinateIntervalComponent", "The interval defined by the coordinate.", 0, 1, coordinateInterval);
                case 2065205984: /*strand*/
                    return new Property("strand", "CodeableConcept", "Specifies the strand on which the location sequence resides.", 0, 1, strand);
                default:
                    return super.getNamedProperty(_hash, _name, _checkValid);
            }
        }

        @Override
        public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
            switch (hash) {
                case -1618432855: /*sequenceContext*/
                    return this.sequenceContext == null ? new Base[0] : new Base[]{this.sequenceContext}; // Reference
                case -1724546052: /*coordinateInterval*/
                    return this.coordinateInterval == null ? new Base[0] : new Base[]{this.coordinateInterval}; // MolecularDefinitionCoordinateIntervalComponent
                case 2065205984: /*strand*/
                    return this.strand == null ? new Base[0] : new Base[]{this.strand}; // CodeableConcept
                default:
                    return super.getProperty(hash, name, checkValid);
            }
        }

        @Override
        public Base setProperty(int hash, String name, Base value) throws FHIRException {
            switch (hash) {
                case -1618432855: // sequenceContext
                    this.sequenceContext = (Reference) value; // CodeableConcept
                    return value;
                case -1724546052: // coordinateInterval
                    this.coordinateInterval = (MolecularDefinitionCoordinateIntervalComponent) value; // MolecularDefinitionCoordinateIntervalComponent
                    return value;
                case 2065205984: // strand
                    this.strand = (CodeableConcept) value; // CodeableConcept
                    return value;
                default:
                    return super.setProperty(hash, name, value);
            }
        }

        @Override
        public Base setProperty(String name, Base value) throws FHIRException {
            if (name.equals("sequenceContext")) {
                this.sequenceContext = (Reference) value; // CodeableConcept
            } else if (name.equals("coordinateInterval")) {
                this.coordinateInterval = (MolecularDefinitionCoordinateIntervalComponent) value; // MolecularDefinitionCoordinateIntervalComponent
            } else if (name.equals("strand")) {
                this.strand = (CodeableConcept) value; // CodeableConcept
            } else {
                return super.setProperty(name, value);
            }
            return value;
        }

        @Override
        public void removeChild(String name, Base value) throws FHIRException {
            if (name.equals("sequenceContext")) {
                this.sequenceContext = null;
            } else if (name.equals("coordinateInterval")) {
                this.coordinateInterval = null;
            } else if (name.equals("strand")) {
                this.strand = null;
            } else {
                super.removeChild(name, value);
            }
        }

        @Override
        public Base makeProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case -1618432855:
                    return getSequenceContext();
                case -1724546052:
                    return getCoordinateInterval();
                case 2065205984:
                    return getStrand();
                default:
                    return super.makeProperty(hash, name);
            }
        }

        @Override
        public String[] getTypesForProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case -1618432855: /*sequenceContext*/
                    return new String[]{"Reference"};
                case -1724546052: /*coordinateInterval*/
                    return new String[]{"MolecularDefinitionCoordinateIntervalComponent"};
                case 2065205984: /*strand*/
                    return new String[]{"CodeableConcept"};
                default:
                    return super.getTypesForProperty(hash, name);
            }
        }

        @Override
        public Base addChild(String name) throws FHIRException {
            if (name.equals("sequenceContext")) {
                this.sequenceContext = new Reference();
                return this.sequenceContext;
            } else if (name.equals("coordinateInterval")) {
                this.coordinateInterval = new MolecularDefinitionCoordinateIntervalComponent();
                return this.coordinateInterval;
            } else if (name.equals("strand")) {
                this.strand = new CodeableConcept();
                return this.strand;
            } else {
                return super.addChild(name);
            }
        }

        public void copyValues(MolecularDefinitionLocationSequenceLocationComponent dst) {
            super.copyValues(dst);
            if (dst instanceof MolecularDefinitionLocationSequenceLocationComponent) {
                MolecularDefinitionLocationSequenceLocationComponent target = (MolecularDefinitionLocationSequenceLocationComponent) dst;
                target.sequenceContext = this.sequenceContext == null ? null : this.sequenceContext.copy();
                target.coordinateInterval = this.coordinateInterval == null ? null : this.coordinateInterval.copy();
                target.strand = this.strand == null ? null : this.strand.copy();
            }
        }

        @Override
        public boolean equalsDeep(Base other_) {
            if (!super.equalsDeep(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionLocationSequenceLocationComponent))
                return false;
            MolecularDefinitionLocationSequenceLocationComponent o = (MolecularDefinitionLocationSequenceLocationComponent) other_;
            return compareDeep(sequenceContext, o.sequenceContext, true) &&
                    compareDeep(coordinateInterval, o.coordinateInterval, true) &&
                    compareDeep(strand, o.strand, true);
        }

        @Override
        public boolean equalsShallow(Base other_) {
            if (!super.equalsShallow(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionLocationSequenceLocationComponent))
                return false;
            MolecularDefinitionLocationSequenceLocationComponent o = (MolecularDefinitionLocationSequenceLocationComponent) other_;
            return true;
        }

        @Override
        public boolean isEmpty() {
            return super.isEmpty() &&
                    (sequenceContext == null || sequenceContext.isEmpty()) &&
                    (coordinateInterval == null || coordinateInterval.isEmpty()) &&
                    (strand == null || strand.isEmpty());
        }

        public MolecularDefinitionLocationSequenceLocationComponent copy() {
            MolecularDefinitionLocationSequenceLocationComponent dst = new MolecularDefinitionLocationSequenceLocationComponent();
            copyValues(dst);
            return dst;
        }

        public String fhirType() {
            return "MolecularDefinitionLocationSequenceLocationComponent";
        }
    }

    @Block
    public static class MolecularDefinitionLocationGenomeAssemblyComponent extends BackboneElement implements IBaseBackboneElement {

        /**
         * A reference to a sequence on which the location is defined.
         */
        @Child(name = "organism", type = {MolecularDefinition.class}, order = 0, min = 0, max = 1, modifier = false, summary = false)
        @Description(shortDefinition = "Species of the organism", formalDefinition = "Species of the organism.")
        protected CodeableConcept organism;

        /**
         * A reference to a sequence on which the location is defined.
         */
        @Child(name = "build", type = {MolecularDefinition.class}, order = 1, min = 0, max = 1, modifier = false, summary = false)
        @Description(shortDefinition = "Build number", formalDefinition = "The build number of this genome assemble.")
        protected CodeableConcept build;

        /**
         * A reference to a sequence on which the location is defined.
         */
        @Child(name = "accession", type = {MolecularDefinition.class}, order = 2, min = 0, max = 1, modifier = false, summary = false)
        @Description(shortDefinition = "Accession", formalDefinition = "The accession of this genome assemble.")
        protected CodeableConcept accession;

        /**
         * Genome assembly description.
         */
        @Child(name = "description", type = {MarkdownType.class, StringType.class}, order = 3, min = 0, max = 1, modifier = false, summary = false)
        @Description(shortDefinition = "Genome assembly description", formalDefinition = "The description of this genome assembly.")
        protected DataType description;

        private static final long serialVersionUID = 7247478994L;

        /**
         * Constructor
         */
        public MolecularDefinitionLocationGenomeAssemblyComponent() {
            super();
        }

        @Override
        protected void listChildren(List<Property> children) {
            super.listChildren(children);
            children.add(new Property("organism", "CodeableConcept", "The organism for which the genome assembly is defined.", 0, 1, organism));
            children.add(new Property("build", "CodeableConcept", "The genome build being referenced.", 0, 1, build));
            children.add(new Property("accession", "CodeableConcept", "The accession number for the assembly.", 0, 1, accession));
            children.add(new Property("description", "string", "A description of the genome assembly.", 0, 1, description));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
            switch (_hash) {
                case 1316389074: /*organism*/
                    return new Property("organism", "CodeableConcept", "The organism for which the genome assembly is defined.", 0, 1, organism);
                case 94094958: /*build*/
                    return new Property("build", "CodeableConcept", "The genome build being referenced.", 0, 1, build);
                case -2115028956: /*accession*/
                    return new Property("accession", "CodeableConcept", "The accession number for the assembly.", 0, 1, accession);
                case -1724546052: /*description*/
                    return new Property("description", "string", "A description of the genome assembly.", 0, 1, description);
                default:
                    return super.getNamedProperty(_hash, _name, _checkValid);
            }
        }

        @Override
        public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
            switch (hash) {
                case 1316389074: /*organism*/
                    return this.organism == null ? new Base[0] : new Base[]{this.organism}; // CodeableConcept
                case 94094958: /*build*/
                    return this.build == null ? new Base[0] : new Base[]{this.build}; // CodeableConcept
                case -2115028956: /*accession*/
                    return this.accession == null ? new Base[0] : new Base[]{this.accession}; // StringType
                case -1724546052: /*description*/
                    return this.description == null ? new Base[0] : new Base[]{this.description}; // StringType
                default:
                    return super.getProperty(hash, name, checkValid);
            }
        }

        @Override
        public Base setProperty(int hash, String name, Base value) throws FHIRException {
            switch (hash) {
                case 1316389074: // organism
                    this.organism = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
                    return value;
                case 94094958: // build
                    this.build = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
                    return value;
                case -2115028956: // accession
                    this.accession = TypeConvertor.castToCodeableConcept(value); // StringType
                    return value;
                case -1724546052: // description
                    this.description = TypeConvertor.castToString(value); // StringType
                    return value;
                default:
                    return super.setProperty(hash, name, value);
            }
        }

        @Override
        public Base setProperty(String name, Base value) throws FHIRException {
            if (name.equals("organism")) {
                this.organism = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
            } else if (name.equals("build")) {
                this.build = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
            } else if (name.equals("accession")) {
                this.accession = TypeConvertor.castToCodeableConcept(value); // StringType
            } else if (name.equals("description")) {
                this.description = TypeConvertor.castToString(value); // StringType
            } else {
                return super.setProperty(name, value);
            }
            return value;
        }

        @Override
        public void removeChild(String name, Base value) throws FHIRException {
            if (name.equals("organism")) {
                this.organism = null;
            } else if (name.equals("build")) {
                this.build = null;
            } else if (name.equals("accession")) {
                this.accession = null;
            } else if (name.equals("description")) {
                this.description = null;
            } else {
                super.removeChild(name, value);
            }
        }

        @Override
        public Base makeProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case 1316389074:
                    return getOrganism();
                case 94094958:
                    return getBuild();
                case -2115028956:
                    return getAccessionElement();
                case -1724546052:
                    return getDescription();
                default:
                    return super.makeProperty(hash, name);
            }
        }

        @Override
        public String[] getTypesForProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case 1316389074: /*organism*/
                    return new String[]{"CodeableConcept"};
                case 94094958: /*build*/
                    return new String[]{"CodeableConcept"};
                case -2115028956: /*accession*/
                    return new String[]{"CodeableConcept"};
                case -1724546052: /*description*/
                    return new String[]{"string"};
                default:
                    return super.getTypesForProperty(hash, name);
            }
        }

        @Override
        public Base addChild(String name) throws FHIRException {
            if (name.equals("organism")) {
                this.organism = new CodeableConcept();
                return this.organism;
            } else if (name.equals("build")) {
                this.build = new CodeableConcept();
                return this.build;
            } else if (name.equals("accession")) {
                this.build = new CodeableConcept();
                return this.build;
            } else if (name.equals("description")) {
                throw new FHIRException("Cannot call addChild on a primitive type 'description'");
            } else {
                return super.addChild(name);
            }
        }

        public void copyValues(MolecularDefinitionLocationGenomeAssemblyComponent dst) {
            super.copyValues(dst);
            if (dst instanceof MolecularDefinitionLocationGenomeAssemblyComponent) {
                MolecularDefinitionLocationGenomeAssemblyComponent target = (MolecularDefinitionLocationGenomeAssemblyComponent) dst;
                target.organism = this.organism == null ? null : this.organism.copy();
                target.build = this.build == null ? null : this.build.copy();
                target.accession = this.accession == null ? null : this.accession.copy();
                target.description = this.description == null ? null : this.description.copy();
            }
        }

        @Override
        public boolean equalsDeep(Base other_) {
            if (!super.equalsDeep(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionLocationGenomeAssemblyComponent))
                return false;
            MolecularDefinitionLocationGenomeAssemblyComponent o = (MolecularDefinitionLocationGenomeAssemblyComponent) other_;
            return compareDeep(organism, o.organism, true) &&
                    compareDeep(build, o.build, true) &&
                    compareDeep(accession, o.accession, true) &&
                    compareDeep(description, o.description, true);
        }

        @Override
        public boolean equalsShallow(Base other_) {
            if (!super.equalsShallow(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionLocationGenomeAssemblyComponent))
                return false;
            MolecularDefinitionLocationGenomeAssemblyComponent o = (MolecularDefinitionLocationGenomeAssemblyComponent) other_;
            return true;
        }

        @Override
        public boolean isEmpty() {
            return super.isEmpty() &&
                    (organism == null || organism.isEmpty()) &&
                    (build == null || build.isEmpty()) &&
                    (accession == null || accession.isEmpty()) &&
                    (description == null || description.isEmpty());
        }

        /**
         * @return {@link #organism} (The organism for which the genome assembly is defined.)
         */
        public CodeableConcept getOrganism() {
            if (this.organism == null) {
                this.organism = new CodeableConcept(); // Instantiate if null
            }
            return this.organism;
        }

        public boolean hasOrganism() {
            return this.organism != null && !this.organism.isEmpty();
        }

        /**
         * @param value {@link #organism} (The organism for which the genome assembly is defined.)
         */
        public MolecularDefinitionLocationGenomeAssemblyComponent setOrganism(CodeableConcept value) {
            this.organism = value;
            return this; // Enable method chaining
        }

        /**
         * @return {@link #build} (The genome build being referenced.)
         */
        public CodeableConcept getBuild() {
            if (this.build == null) {
                this.build = new CodeableConcept(); // Instantiate if null
            }
            return this.build;
        }

        public boolean hasBuild() {
            return this.build != null && !this.build.isEmpty();
        }

        /**
         * @param value {@link #build} (The genome build being referenced.)
         */
        public MolecularDefinitionLocationGenomeAssemblyComponent setBuild(CodeableConcept value) {
            this.build = value;
            return this; // Enable method chaining
        }

        /**
         * @return {@link #accession} (The accession number for the assembly.)
         */
        public CodeableConcept getAccessionElement() {
            if (this.accession == null) {
                this.accession = new CodeableConcept(); // Instantiate if null
            }
            return this.accession;
        }

        public boolean hasAccessionElement() {
            return this.accession != null && !this.accession.isEmpty();
        }

        /**
         * @param value {@link #accession} (The accession number for the assembly.)
         */
        public MolecularDefinitionLocationGenomeAssemblyComponent setAccessionElement(CodeableConcept value) {
            this.accession = value;
            return this; // Enable method chaining
        }

        public CodeableConcept getAccession() {
            return this.accession == null ? null : this.accession;
        }

        public MolecularDefinitionLocationGenomeAssemblyComponent setAccession(CodeableConcept value) {
            if (value == null) {
                this.accession = null;
            } else {
                this.accession = value;
            }
            return this;
        }

        /**
         * @return {@link #description} (Genome assembly description.)
         */
        public DataType getDescription() {
            return this.description;
        }

        /**
         * @return {@link #description} (Genome assembly description.)
         */
        public MarkdownType getDescriptionMarkdown() throws FHIRException {
            if (this.description == null)
                this.description = new Quantity();
            if (!(this.description instanceof Quantity))
                throw new FHIRException("Type mismatch: the type MarkdownType was expected, but " + this.description.getClass().getName() + " was encountered");
            return (MarkdownType) this.description;
        }

        public boolean hasDescriptionMarkdownType() {
            return this != null && this.description instanceof MarkdownType;
        }

        /**
         * @return {@link #description} (Genome assembly description.)
         */
        public DateTimeType getDescriptionStringType() throws FHIRException {
            if (this.description == null)
                this.description = new StringType();
            if (!(this.description instanceof StringType))
                throw new FHIRException("Type mismatch: the type StringType was expected, but " + this.description.getClass().getName() + " was encountered");
            return (DateTimeType) this.description;
        }

        public boolean hasDescriptionStringType() {
            return this != null && this.description instanceof StringType;
        }

        public boolean hasDescription() {
            return this.description != null && !this.description.isEmpty();
        }

        /**
         * @param value {@link #description} (The start location of the interval.)
         */
        public MolecularDefinitionLocationGenomeAssemblyComponent setDescription(DataType value) {
            if (value != null && !(value instanceof MarkdownType || value instanceof StringType))
                throw new FHIRException("Not the right type for GenomeAssembly.description[x]: " + value.fhirType());
            this.description = value;
            return this;
        }

        public MolecularDefinitionLocationGenomeAssemblyComponent copy() {
            MolecularDefinitionLocationGenomeAssemblyComponent dst = new MolecularDefinitionLocationGenomeAssemblyComponent();
            copyValues(dst);
            return dst;
        }
    }

    @Block
    public static class MolecularDefinitionLocationCytobandComponent extends BackboneElement implements IBaseBackboneElement {

        /**
         * The arm of this interval.
         */
        @Child(name = "arm", type = {CodeType.class, StringType.class}, order = 0, min = 0, max = 1, modifier = false, summary = false)
        @Description(shortDefinition = "Arm", formalDefinition = "The arm of this interval.")
        protected DataType arm;

        /**
         * The region of this start interval.
         */
        @Child(name = "region", type = {CodeType.class, StringType.class}, order = 1, min = 0, max = 1, modifier = false, summary = false)
        @Description(shortDefinition = "Region", formalDefinition = "The region of this start interval.")
        protected DataType region;

        /**
         * The band of this start interval.
         */
        @Child(name = "band", type = {CodeType.class, StringType.class}, order = 2, min = 0, max = 1, modifier = false, summary = false)
        @Description(shortDefinition = "Band", formalDefinition = "The band of this start interval.")
        protected DataType band;

        /**
         * The sub-band of this start interval.
         */
        @Child(name = "subBand", type = {CodeType.class, StringType.class}, order = 3, min = 0, max = 1, modifier = false, summary = false)
        @Description(shortDefinition = "Sub-band", formalDefinition = "The sub-band of this start interval.")
        protected DataType subBand;

        private static final long serialVersionUID = 3752478924L;

        /**
         * Constructor
         */
        public MolecularDefinitionLocationCytobandComponent() {
            super();
        }

        /**
         * @return {@link #band} (Specifies the band within the region.)
         */
        public DataType getBand() {
            return this.band;
        }

        /**
         * @return {@link #band} (Specifies the band within the region as a CodeType.)
         */
        public CodeType getBandCode() throws FHIRException {
            if (this.band == null) {
                this.band = new CodeType(); // Initialize as CodeType if null
            }
            if (!(this.band instanceof CodeType)) {
                throw new FHIRException("Type mismatch: the type CodeType was expected, but " + this.band.getClass().getName() + " was encountered");
            }
            return (CodeType) this.band;
        }

        /**
         * @return {@link #band} (Specifies the band within the region as a StringType.)
         */
        public StringType getBandString() throws FHIRException {
            if (this.band == null) {
                this.band = new StringType(); // Initialize as StringType if null
            }
            if (!(this.band instanceof StringType)) {
                throw new FHIRException("Type mismatch: the type StringType was expected, but " + this.band.getClass().getName() + " was encountered");
            }
            return (StringType) this.band;
        }

        public boolean hasBand() {
            return this.band != null && !this.band.isEmpty();
        }

        public boolean hasBandCode() {
            return this.band instanceof CodeType;
        }

        public boolean hasBandString() {
            return this.band instanceof StringType;
        }

        /**
         * @param value {@link #band} (The band within the region.)
         */
        public MolecularDefinitionLocationCytobandComponent setBand(DataType value) throws FHIRException {
            if (value != null && !(value instanceof CodeType || value instanceof StringType)) {
                throw new FHIRException("Not the right type for band[x]: " + value.fhirType());
            }
            this.band = value;
            return this;
        }

        /**
         * @return {@link #arm} (The chromosome arm (e.g., p or q).)
         */
        public DataType getArm() {
            return this.arm;
        }

        /**
         * @return {@link #arm} (The chromosome arm as a CodeType.)
         */
        public CodeType getArmCode() throws FHIRException {
            if (this.arm == null) {
                this.arm = new CodeType(); // Initialize as CodeType if null
            }
            if (!(this.arm instanceof CodeType)) {
                throw new FHIRException("Type mismatch: the type CodeType was expected, but " + this.arm.getClass().getName() + " was encountered");
            }
            return (CodeType) this.arm;
        }

        /**
         * @return {@link #arm} (The chromosome arm as a StringType.)
         */
        public StringType getArmString() throws FHIRException {
            if (this.arm == null) {
                this.arm = new StringType(); // Initialize as StringType if null
            }
            if (!(this.arm instanceof StringType)) {
                throw new FHIRException("Type mismatch: the type StringType was expected, but " + this.arm.getClass().getName() + " was encountered");
            }
            return (StringType) this.arm;
        }

        public boolean hasArm() {
            return this.arm != null && !this.arm.isEmpty();
        }

        public boolean hasArmCode() {
            return this.arm instanceof CodeType;
        }

        public boolean hasArmString() {
            return this.arm instanceof StringType;
        }

        /**
         * @param value {@link #arm} (The chromosome arm.)
         */
        public MolecularDefinitionLocationCytobandComponent setArm(DataType value) throws FHIRException {
            if (value != null && !(value instanceof CodeType || value instanceof StringType)) {
                throw new FHIRException("Not the right type for arm[x]: " + value.fhirType());
            }
            this.arm = value;
            return this;
        }

        /**
         * @return {@link #region} (Specifies the cytogenetic region.)
         */
        public DataType getRegion() {
            return this.region;
        }

        /**
         * @return {@link #region} (Specifies the cytogenetic region as a CodeType.)
         */
        public CodeType getRegionCode() throws FHIRException {
            if (this.region == null) {
                this.region = new CodeType(); // Initialize as CodeType if null
            }
            if (!(this.region instanceof CodeType)) {
                throw new FHIRException("Type mismatch: the type CodeType was expected, but " + this.region.getClass().getName() + " was encountered");
            }
            return (CodeType) this.region;
        }

        /**
         * @return {@link #region} (Specifies the cytogenetic region as a StringType.)
         */
        public StringType getRegionString() throws FHIRException {
            if (this.region == null) {
                this.region = new StringType(); // Initialize as StringType if null
            }
            if (!(this.region instanceof StringType)) {
                throw new FHIRException("Type mismatch: the type StringType was expected, but " + this.region.getClass().getName() + " was encountered");
            }
            return (StringType) this.region;
        }

        public boolean hasRegion() {
            return this.region != null && !this.region.isEmpty();
        }

        public boolean hasRegionCode() {
            return this.region instanceof CodeType;
        }

        public boolean hasRegionString() {
            return this.region instanceof StringType;
        }

        /**
         * @param value {@link #region} (The region within the chromosome.)
         */
        public MolecularDefinitionLocationCytobandComponent setRegion(DataType value) throws FHIRException {
            if (value != null && !(value instanceof CodeType || value instanceof StringType)) {
                throw new FHIRException("Not the right type for region[x]: " + value.fhirType());
            }
            this.region = value;
            return this;
        }

        /**
         * @return {@link #subBand} (Specifies the sub-band within the band.)
         */
        public DataType getSubBand() {
            return this.subBand;
        }

        /**
         * @return {@link #subBand} (Specifies the sub-band within the band as a CodeType.)
         */
        public CodeType getSubBandCode() throws FHIRException {
            if (this.subBand == null) {
                this.subBand = new CodeType(); // Initialize as CodeType if null
            }
            if (!(this.subBand instanceof CodeType)) {
                throw new FHIRException("Type mismatch: the type CodeType was expected, but " + this.subBand.getClass().getName() + " was encountered");
            }
            return (CodeType) this.subBand;
        }

        /**
         * @return {@link #subBand} (Specifies the sub-band within the band as a StringType.)
         */
        public StringType getSubBandString() throws FHIRException {
            if (this.subBand == null) {
                this.subBand = new StringType(); // Initialize as StringType if null
            }
            if (!(this.subBand instanceof StringType)) {
                throw new FHIRException("Type mismatch: the type StringType was expected, but " + this.subBand.getClass().getName() + " was encountered");
            }
            return (StringType) this.subBand;
        }

        public boolean hasSubBand() {
            return this.subBand != null && !this.subBand.isEmpty();
        }

        public boolean hasSubBandCode() {
            return this.subBand instanceof CodeType;
        }

        public boolean hasSubBandString() {
            return this.subBand instanceof StringType;
        }

        /**
         * @param value {@link #subBand} (The sub-band within the band.)
         */
        public MolecularDefinitionLocationCytobandComponent setSubBand(DataType value) throws FHIRException {
            if (value != null && !(value instanceof CodeType || value instanceof StringType)) {
                throw new FHIRException("Not the right type for subBand[x]: " + value.fhirType());
            }
            this.subBand = value;
            return this;
        }


        public MolecularDefinitionLocationCytobandComponent copy() {
            MolecularDefinitionLocationCytobandComponent dst = new MolecularDefinitionLocationCytobandComponent();
            copyValues(dst);
            return dst;
        }

        @Override
        protected void listChildren(List<Property> children) {
            super.listChildren(children);
            children.add(new Property("arm", "CodeType | StringType", "The chromosome arm (e.g., p or q).", 0, 1, arm));
            children.add(new Property("region", "CodeType | StringType", "Specifies the cytogenetic region.", 0, 1, region));
            children.add(new Property("band", "CodeType | StringType", "Specifies the band within the region.", 0, 1, band));
            children.add(new Property("subBand", "CodeType | StringType", "Specifies the sub-band within the band.", 0, 1, subBand));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
            switch (_hash) {
                case 96860: /* arm */
                    return new Property("arm", "CodeType | StringType", "The chromosome arm (e.g., p or q).", 0, 1, arm);
                case -934795532: /* region */
                    return new Property("region", "CodeType | StringType", "Specifies the cytogenetic region.", 0, 1, region);
                case 3016245: /* band */
                    return new Property("band", "CodeType | StringType", "Specifies the band within the region.", 0, 1, band);
                case -1869080427: /* subBand */
                    return new Property("subBand", "CodeType | StringType", "Specifies the sub-band within the band.", 0, 1, subBand);
                default:
                    return super.getNamedProperty(_hash, _name, _checkValid);
            }
        }

        @Override
        public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
            switch (hash) {
                case 96860: /* arm */
                    return this.arm == null ? new Base[0] : new Base[] {this.arm}; // DataType
                case -934795532: /* region */
                    return this.region == null ? new Base[0] : new Base[] {this.region}; // DataType
                case 3016245: /* band */
                    return this.band == null ? new Base[0] : new Base[] {this.band}; // DataType
                case -1869080427: /* subBand */
                    return this.subBand == null ? new Base[0] : new Base[] {this.subBand}; // DataType
                default:
                    return super.getProperty(hash, name, checkValid);
            }
        }

        @Override
        public Base setProperty(int hash, String name, Base value) throws FHIRException {
            switch (hash) {
                case 96860: // arm
                    this.arm = TypeConvertor.castToType(value); // DataType
                    return value;
                case -934795532: // region
                    this.region = TypeConvertor.castToType(value); // DataType
                    return value;
                case 3016245: // band
                    this.band = TypeConvertor.castToType(value); // DataType
                    return value;
                case -1869080427: // subBand
                    this.subBand = TypeConvertor.castToType(value); // DataType
                    return value;
                default:
                    return super.setProperty(hash, name, value);
            }
        }

        @Override
        public Base setProperty(String name, Base value) throws FHIRException {
            if (name.equals("arm")) {
                this.arm = TypeConvertor.castToType(value); // DataType
            } else if (name.equals("region")) {
                this.region = TypeConvertor.castToType(value); // DataType
            } else if (name.equals("band")) {
                this.band = TypeConvertor.castToType(value); // DataType
            } else if (name.equals("subBand")) {
                this.subBand = TypeConvertor.castToType(value); // DataType
            } else {
                return super.setProperty(name, value);
            }
            return value;
        }

        @Override
        public void removeChild(String name, Base value) throws FHIRException {
            if (name.equals("arm")) {
                this.arm = null;
            } else if (name.equals("region")) {
                this.region = null;
            } else if (name.equals("band")) {
                this.band = null;
            } else if (name.equals("subBand")) {
                this.subBand = null;
            } else {
                super.removeChild(name, value);
            }
        }

        @Override
        public Base makeProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case 96860:  return getArm();
                case -934795532:  return getRegion();
                case 3016245:  return getBand();
                case -1869080427:  return getSubBand();
                default: return super.makeProperty(hash, name);
            }
        }

        @Override
        public String[] getTypesForProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case 96860: /* arm */ return new String[] {"CodeType", "StringType"};
                case -934795532: /* region */ return new String[] {"CodeType", "StringType"};
                case 3016245: /* band */ return new String[] {"CodeType", "StringType"};
                case -1869080427: /* subBand */ return new String[] {"CodeType", "StringType"};
                default: return super.getTypesForProperty(hash, name);
            }
        }

        @Override
        public Base addChild(String name) throws FHIRException {
            if (name.equals("arm")) {
                throw new FHIRException("Cannot call addChild on a type 'arm'");
            } else if (name.equals("region")) {
                throw new FHIRException("Cannot call addChild on a type 'region'");
            } else if (name.equals("band")) {
                throw new FHIRException("Cannot call addChild on a type 'band'");
            } else if (name.equals("subBand")) {
                throw new FHIRException("Cannot call addChild on a type 'subBand'");
            } else {
                return super.addChild(name);
            }
        }

        public void copyValues(MolecularDefinitionLocationCytobandComponent dst) {
            super.copyValues(dst);
            if (dst instanceof MolecularDefinitionLocationCytobandComponent) {
                MolecularDefinitionLocationCytobandComponent target = (MolecularDefinitionLocationCytobandComponent) dst;
                target.arm = this.arm == null ? null : this.arm.copy();
                target.region = this.region == null ? null : this.region.copy();
                target.band = this.band == null ? null : this.band.copy();
                target.subBand = this.subBand == null ? null : this.subBand.copy();
            }
        }

        @Override
        public boolean equalsDeep(Base other_) {
            if (!super.equalsDeep(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionLocationCytobandComponent))
                return false;
            MolecularDefinitionLocationCytobandComponent o = (MolecularDefinitionLocationCytobandComponent) other_;
            return compareDeep(arm, o.arm, true) &&
                    compareDeep(region, o.region, true) &&
                    compareDeep(band, o.band, true) &&
                    compareDeep(subBand, o.subBand, true);
        }

        @Override
        public boolean equalsShallow(Base other_) {
            if (!super.equalsShallow(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionLocationCytobandComponent))
                return false;
            MolecularDefinitionLocationCytobandComponent o = (MolecularDefinitionLocationCytobandComponent) other_;
            return true;
        }

        @Override
        public boolean isEmpty() {
            return super.isEmpty() &&
                    (arm == null || arm.isEmpty()) &&
                    (region == null || region.isEmpty()) &&
                    (band == null || band.isEmpty()) &&
                    (subBand == null || subBand.isEmpty());
        }

        @Override
        public String fhirType() {
            return "MolecularDefinitionLocationCytobandComponent";
        }
    }

    @Block
    public static class MolecularDefinitionLocationCytobandIntervalComponent extends BackboneElement implements IBaseBackboneElement {

        /**
         * The arm of this interval.
         */
        @Child(name = "chromosome", type = {CodeableConcept.class}, order = 0, min = 1, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "Chromosome", formalDefinition = "The chromosome where this cytoband interval occurs.")
        protected CodeableConcept chromosome;

        /**
         * The arm of this interval.
         */
        @Child(name = "startCytoband", type = {MolecularDefinitionLocationCytobandComponent.class}, order = 1, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "Start", formalDefinition = "The start of this cytoband Interval.")
        protected MolecularDefinitionLocationCytobandComponent startCytoband;

        /**
         * The arm of this interval.
         */
        @Child(name = "endCytoband", type = {MolecularDefinitionLocationCytobandComponent.class}, order = 2, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "End", formalDefinition = "The end of this cytoband Interval.")
        protected MolecularDefinitionLocationCytobandComponent endCytoband;

        private static final long serialVersionUID = 373435278924L;

        /**
         * Constructor
         */
        public MolecularDefinitionLocationCytobandIntervalComponent() {
            super();
        }

        @Override
        protected void listChildren(List<Property> children) {
            super.listChildren(children);
            children.add(new Property("chromosome", "CodeableConcept", "The targeted chromosome.", 0, 1, chromosome));
            children.add(new Property("startCytoband", "MolecularDefinitionLocationCytobandComponent", "The starting cytoband within the chromosome.", 0, 1, startCytoband));
            children.add(new Property("endCytoband", "MolecularDefinitionLocationCytobandComponent", "The ending cytoband within the chromosome.", 0, 1, endCytoband));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
            switch (_hash) {
                case -1499470472: /* chromosome */
                    return new Property("chromosome", "CodeableConcept", "The targeted chromosome.", 0, 1, chromosome);
                case 11952552: /* startCytoband */
                    return new Property("startCytoband", "MolecularDefinitionLocationCytobandComponent", "The starting cytoband within the chromosome.", 0, 1, startCytoband);
                case -1652450015: /* endCytoband */
                    return new Property("endCytoband", "MolecularDefinitionLocationCytobandComponent", "The ending cytoband within the chromosome.", 0, 1, endCytoband);
                default:
                    return super.getNamedProperty(_hash, _name, _checkValid);
            }
        }

        @Override
        public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
            switch (hash) {
                case -1499470472: /* chromosome */
                    return this.chromosome == null ? new Base[0] : new Base[] {this.chromosome};
                case 11952552: /* startCytoband */
                    return this.startCytoband == null ? new Base[0] : new Base[] {this.startCytoband};
                case -1652450015: /* endCytoband */
                    return this.endCytoband == null ? new Base[0] : new Base[] {this.endCytoband};
                default:
                    return super.getProperty(hash, name, checkValid);
            }
        }

        @Override
        public Base setProperty(int hash, String name, Base value) throws FHIRException {
            switch (hash) {
                case -1499470472: // chromosome
                    this.chromosome = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
                    return value;
                case 11952552: // startCytoband
                    this.startCytoband = (MolecularDefinitionLocationCytobandComponent) value; // Explicit casting
                    return value;
                case -1652450015: // endCytoband
                    this.endCytoband = (MolecularDefinitionLocationCytobandComponent) value; // Explicit casting
                    return value;
                default:
                    return super.setProperty(hash, name, value);
            }
        }

        @Override
        public Base setProperty(String name, Base value) throws FHIRException {
            if (name.equals("chromosome")) {
                this.chromosome = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
            } else if (name.equals("startCytoband")) {
                this.startCytoband = (MolecularDefinitionLocationCytobandComponent) value; // Explicit casting
            } else if (name.equals("endCytoband")) {
                this.endCytoband = (MolecularDefinitionLocationCytobandComponent) value; // Explicit casting
            } else {
                return super.setProperty(name, value);
            }
            return value;
        }

        @Override
        public void removeChild(String name, Base value) throws FHIRException {
            if (name.equals("chromosome")) {
                this.chromosome = null;
            } else if (name.equals("startCytoband")) {
                this.startCytoband = null;
            } else if (name.equals("endCytoband")) {
                this.endCytoband = null;
            } else {
                super.removeChild(name, value);
            }
        }

        @Override
        public Base makeProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case -1499470472: return getChromosome();
                case 11952552: return getStartCytoband();
                case -1652450015: return getEndCytoband();
                default: return super.makeProperty(hash, name);
            }
        }

        @Override
        public String[] getTypesForProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case -1499470472: /* chromosome */ return new String[] {"CodeableConcept"};
                case 11952552: /* startCytoband */ return new String[] {"MolecularDefinitionLocationCytobandComponent"};
                case -1652450015: /* endCytoband */ return new String[] {"MolecularDefinitionLocationCytobandComponent"};
                default: return super.getTypesForProperty(hash, name);
            }
        }

        @Override
        public Base addChild(String name) throws FHIRException {
            if (name.equals("chromosome")) {
                this.chromosome = new CodeableConcept();
                return this.chromosome;
            } else if (name.equals("startCytoband")) {
                this.startCytoband = new MolecularDefinitionLocationCytobandComponent();
                return this.startCytoband;
            } else if (name.equals("endCytoband")) {
                this.endCytoband = new MolecularDefinitionLocationCytobandComponent();
                return this.endCytoband;
            } else {
                return super.addChild(name);
            }
        }

        public void copyValues(MolecularDefinitionLocationCytobandIntervalComponent dst) {
            super.copyValues(dst);
            if (dst instanceof MolecularDefinitionLocationCytobandIntervalComponent) {
                MolecularDefinitionLocationCytobandIntervalComponent target = (MolecularDefinitionLocationCytobandIntervalComponent) dst;
                target.chromosome = this.chromosome == null ? null : this.chromosome.copy();
                target.startCytoband = this.startCytoband == null ? null : this.startCytoband.copy();
                target.endCytoband = this.endCytoband == null ? null : this.endCytoband.copy();
            }
        }

        @Override
        public boolean equalsDeep(Base other_) {
            if (!super.equalsDeep(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionLocationCytobandIntervalComponent))
                return false;
            MolecularDefinitionLocationCytobandIntervalComponent o = (MolecularDefinitionLocationCytobandIntervalComponent) other_;
            return compareDeep(chromosome, o.chromosome, true) &&
                    compareDeep(startCytoband, o.startCytoband, true) &&
                    compareDeep(endCytoband, o.endCytoband, true);
        }

        @Override
        public boolean equalsShallow(Base other_) {
            if (!super.equalsShallow(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionLocationCytobandIntervalComponent))
                return false;
            MolecularDefinitionLocationCytobandIntervalComponent o = (MolecularDefinitionLocationCytobandIntervalComponent) other_;
            return true;
        }

        @Override
        public boolean isEmpty() {
            return super.isEmpty() &&
                    (chromosome == null || chromosome.isEmpty()) &&
                    (startCytoband == null || startCytoband.isEmpty()) &&
                    (endCytoband == null || endCytoband.isEmpty());
        }

        @Override
        public String fhirType() {
            return "MolecularDefinitionLocationCytobandIntervalComponent";
        }

        /**
         * @return {@link #chromosome} (The targeted chromosome.)
         */
        public CodeableConcept getChromosome() {
            return this.chromosome;
        }

        /**
         * @param value {@link #chromosome} (The targeted chromosome.)
         */
        public MolecularDefinitionLocationCytobandIntervalComponent setChromosome(CodeableConcept value) {
            this.chromosome = value;
            return this;
        }

        /**
         * @return {@link #startCytoband} (The starting cytoband within the chromosome.)
         */
        public MolecularDefinitionLocationCytobandComponent getStartCytoband() {
            if (this.startCytoband == null) {
                this.startCytoband = new MolecularDefinitionLocationCytobandComponent(); // Lazy initialization
            }
            return this.startCytoband;
        }

        /**
         * @param value {@link #startCytoband} (The starting cytoband within the chromosome.)
         */
        public MolecularDefinitionLocationCytobandIntervalComponent setStartCytoband(MolecularDefinitionLocationCytobandComponent value) {
            this.startCytoband = value;
            return this;
        }

        /**
         * @return {@link #endCytoband} (The ending cytoband within the chromosome.)
         */
        public MolecularDefinitionLocationCytobandComponent getEndCytoband() {
            if (this.endCytoband == null) {
                this.endCytoband = new MolecularDefinitionLocationCytobandComponent(); // Lazy initialization
            }
            return this.endCytoband;
        }

        /**
         * @param value {@link #endCytoband} (The ending cytoband within the chromosome.)
         */
        public MolecularDefinitionLocationCytobandIntervalComponent setEndCytoband(MolecularDefinitionLocationCytobandComponent value) {
            this.endCytoband = value;
            return this;
        }

        public boolean hasChromosome() {
            return this.chromosome != null && !this.chromosome.isEmpty();
        }

        public boolean hasStartCytoband() {
            return this.startCytoband != null && !this.startCytoband.isEmpty();
        }

        public boolean hasEndCytoband() {
            return this.endCytoband != null && !this.endCytoband.isEmpty();
        }

        public MolecularDefinitionLocationCytobandIntervalComponent copy() {
            MolecularDefinitionLocationCytobandIntervalComponent dst = new MolecularDefinitionLocationCytobandIntervalComponent();
            copyValues(dst);
            return dst;
        }
    }

    @Block
    public static class MolecularDefinitionLocationCytobandLocationComponent extends BackboneElement implements IBaseBackboneElement {

        /**
         * Reference Genome
         */
        @Child(name = "genomeAssembly", type = {MolecularDefinitionLocationGenomeAssemblyComponent.class}, order = 0, min = 1, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "Reference Genome", formalDefinition = "The reference genome assemble.")
        protected MolecularDefinitionLocationGenomeAssemblyComponent genomeAssembly;

        /**
         * Cytoband Interval
         */
        @Child(name = "cytobandInterval", type = {MolecularDefinitionLocationCytobandIntervalComponent.class}, order = 1, min = 1, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "Cytoband Interval", formalDefinition = "The Cytoband Interval.")
        protected MolecularDefinitionLocationCytobandIntervalComponent cytobandInterval;

        private static final long serialVersionUID = 1036754334323L;

        /**
         * Constructor
         */
        public MolecularDefinitionLocationCytobandLocationComponent() {
            super();
        }

        /**
         * @return {@link #genomeAssembly} (The reference genome.)
         */
        public MolecularDefinitionLocationGenomeAssemblyComponent getGenomeAssembly() {
            if (this.genomeAssembly == null) {
                this.genomeAssembly = new MolecularDefinitionLocationGenomeAssemblyComponent(); // Lazy initialization
            }
            return this.genomeAssembly;
        }

        /**
         * @param value {@link #genomeAssembly} (The reference genome.)
         */
        public MolecularDefinitionLocationCytobandLocationComponent setGenomeAssembly(MolecularDefinitionLocationGenomeAssemblyComponent value) {
            this.genomeAssembly = value;
            return this;
        }

        /**
         * @return {@link #cytobandInterval} (The Cytoband Interval.)
         */
        public MolecularDefinitionLocationCytobandIntervalComponent getCytobandInterval() {
            if (this.cytobandInterval == null) {
                this.cytobandInterval = new MolecularDefinitionLocationCytobandIntervalComponent(); // Lazy initialization
            }
            return this.cytobandInterval;
        }

        /**
         * @param value {@link #cytobandInterval} (The Cytoband Interval.)
         */
        public MolecularDefinitionLocationCytobandLocationComponent setCytobandInterval(MolecularDefinitionLocationCytobandIntervalComponent value) {
            this.cytobandInterval = value;
            return this;
        }

        public boolean hasGenomeAssembly() {
            return this.genomeAssembly != null && !this.genomeAssembly.isEmpty();
        }

        public boolean hasCytobandInterval() {
            return this.cytobandInterval != null && !this.cytobandInterval.isEmpty();
        }

        @Override
        protected void listChildren(List<Property> children) {
            super.listChildren(children);
            children.add(new Property("genomeAssembly", "MolecularDefinitionLocationGenomeAssemblyComponent", "The reference genome.", 1, 1, genomeAssembly));
            children.add(new Property("cytobandInterval", "MolecularDefinitionLocationCytobandIntervalComponent", "The Cytoband Interval.", 1, 1, cytobandInterval));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
            switch (_hash) {
                case -1196021757: // genomeAssembly (sequenceLocation hash reused for clarity)
                    return new Property("genomeAssembly", "MolecularDefinitionLocationGenomeAssemblyComponent", "The reference genome.", 1, 1, genomeAssembly);
                case -600146421: // cytobandInterval
                    return new Property("cytobandInterval", "MolecularDefinitionLocationCytobandIntervalComponent", "The Cytoband Interval.", 1, 1, cytobandInterval);
                default:
                    return super.getNamedProperty(_hash, _name, _checkValid);
            }
        }

        @Override
        public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
            switch (hash) {
                case -1196021757: // genomeAssembly
                    return this.genomeAssembly == null ? new Base[0] : new Base[]{this.genomeAssembly};
                case -600146421: // cytobandInterval
                    return this.cytobandInterval == null ? new Base[0] : new Base[]{this.cytobandInterval};
                default:
                    return super.getProperty(hash, name, checkValid);
            }
        }

        @Override
        public Base setProperty(int hash, String name, Base value) throws FHIRException {
            switch (hash) {
                case -1196021757: // genomeAssembly
                    this.genomeAssembly = (MolecularDefinitionLocationGenomeAssemblyComponent) value; // Explicit casting
                    return value;
                case -600146421: // cytobandInterval
                    this.cytobandInterval = (MolecularDefinitionLocationCytobandIntervalComponent) value; // Explicit casting
                    return value;
                default:
                    return super.setProperty(hash, name, value);
            }
        }

        @Override
        public Base setProperty(String name, Base value) throws FHIRException {
            if (name.equals("genomeAssembly")) {
                this.genomeAssembly = (MolecularDefinitionLocationGenomeAssemblyComponent) value; // Explicit casting
            } else if (name.equals("cytobandInterval")) {
                this.cytobandInterval = (MolecularDefinitionLocationCytobandIntervalComponent) value; // Explicit casting
            } else {
                return super.setProperty(name, value);
            }
            return value;
        }

        @Override
        public Base makeProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case -1196021757: // genomeAssembly
                    return getGenomeAssembly();
                case -600146421: // cytobandInterval
                    return getCytobandInterval();
                default:
                    return super.makeProperty(hash, name);
            }
        }

        @Override
        public String[] getTypesForProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case -1196021757: /* genomeAssembly */
                    return new String[]{"MolecularDefinitionLocationGenomeAssemblyComponent"};
                case -600146421: /* cytobandInterval */
                    return new String[]{"MolecularDefinitionLocationCytobandIntervalComponent"};
                default:
                    return super.getTypesForProperty(hash, name);
            }
        }

        @Override
        public Base addChild(String name) throws FHIRException {
            if (name.equals("genomeAssembly")) {
                this.genomeAssembly = new MolecularDefinitionLocationGenomeAssemblyComponent();
                return this.genomeAssembly;
            } else if (name.equals("cytobandInterval")) {
                this.cytobandInterval = new MolecularDefinitionLocationCytobandIntervalComponent();
                return this.cytobandInterval;
            } else {
                return super.addChild(name);
            }
        }

        @Override
        public void removeChild(String name, Base value) throws FHIRException {
            if (name.equals("genomeAssembly")) {
                this.genomeAssembly = null;
            } else if (name.equals("cytobandInterval")) {
                this.cytobandInterval = null;
            } else {
                super.removeChild(name, value);
            }
        }

        public void copyValues(MolecularDefinitionLocationCytobandLocationComponent dst) {
            super.copyValues(dst);
            if (dst instanceof MolecularDefinitionLocationCytobandLocationComponent) {
                MolecularDefinitionLocationCytobandLocationComponent target = (MolecularDefinitionLocationCytobandLocationComponent) dst;
                target.genomeAssembly = this.genomeAssembly == null ? null : this.genomeAssembly.copy();
                target.cytobandInterval = this.cytobandInterval == null ? null : this.cytobandInterval.copy();
            }
        }

        @Override
        public boolean equalsDeep(Base other_) {
            if (!super.equalsDeep(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionLocationCytobandLocationComponent))
                return false;
            MolecularDefinitionLocationCytobandLocationComponent o = (MolecularDefinitionLocationCytobandLocationComponent) other_;
            return compareDeep(genomeAssembly, o.genomeAssembly, true) &&
                    compareDeep(cytobandInterval, o.cytobandInterval, true);
        }

        @Override
        public boolean equalsShallow(Base other_) {
            if (!super.equalsShallow(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionLocationCytobandLocationComponent))
                return false;
            MolecularDefinitionLocationCytobandLocationComponent o = (MolecularDefinitionLocationCytobandLocationComponent) other_;
            return true;
        }

        @Override
        public boolean isEmpty() {
            return super.isEmpty() &&
                    (genomeAssembly == null || genomeAssembly.isEmpty()) &&
                    (cytobandInterval == null || cytobandInterval.isEmpty());
        }

        @Override
        public String fhirType() {
            return "MolecularDefinitionLocationCytobandLocationComponent";
        }

        public MolecularDefinitionLocationCytobandLocationComponent copy() {
            MolecularDefinitionLocationCytobandLocationComponent dst = new MolecularDefinitionLocationCytobandLocationComponent();
            copyValues(dst);
            return dst;
        }
    }

    @Block()
    public static class MolecularDefinitionLocationComponent extends BackboneElement implements IBaseBackboneElement {

        /**
         * A location on a sequence, defined using a nucleotide coordinate system.
         */
        @Child(name = "sequenceLocation", type = {MolecularDefinitionLocationSequenceLocationComponent.class}, order = 0, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "A coordinate-based location on a sequence", formalDefinition = "A location on a sequence, defined using a nucleotide coordinate system.")
        protected MolecularDefinitionLocationSequenceLocationComponent sequenceLocation;

        /**
         * A location on a sequence, defined using cytobands.
         */
        @Child(name = "cytobandLocation", type = {MolecularDefinitionLocationCytobandLocationComponent.class}, order = 1, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "A cytoband-based location on a sequence", formalDefinition = "A location on a sequence, defined using cytobands.")
        protected MolecularDefinitionLocationCytobandLocationComponent cytobandLocation;

        private static final long serialVersionUID = 89457340582354L;

        /**
         * Constructor
         */
        public MolecularDefinitionLocationComponent() {
            super();
        }

        /**
         * @return {@link #sequenceLocation} (The sequence location.)
         */
        public MolecularDefinitionLocationSequenceLocationComponent getSequenceLocation() {
            if (this.sequenceLocation == null) {
                this.sequenceLocation = new MolecularDefinitionLocationSequenceLocationComponent(); // Lazy initialization
            }
            return this.sequenceLocation;
        }

        /**
         * @param value {@link #sequenceLocation} (The sequence location.)
         */
        public MolecularDefinitionLocationComponent setSequenceLocation(MolecularDefinitionLocationSequenceLocationComponent value) {
            this.sequenceLocation = value;
            return this;
        }

        /**
         * @return {@link #cytobandLocation} (The cytoband location.)
         */
        public MolecularDefinitionLocationCytobandLocationComponent getCytobandLocation() {
            if (this.cytobandLocation == null) {
                this.cytobandLocation = new MolecularDefinitionLocationCytobandLocationComponent(); // Lazy initialization
            }
            return this.cytobandLocation;
        }

        /**
         * @param value {@link #cytobandLocation} (The cytoband location.)
         */
        public MolecularDefinitionLocationComponent setCytobandLocation(MolecularDefinitionLocationCytobandLocationComponent value) {
            this.cytobandLocation = value;
            return this;
        }

        public boolean hasSequenceLocation() {
            return this.sequenceLocation != null && !this.sequenceLocation.isEmpty();
        }

        public boolean hasCytobandLocation() {
            return this.cytobandLocation != null && !this.cytobandLocation.isEmpty();
        }

        @Override
        protected void listChildren(List<Property> children) {
            super.listChildren(children);
            children.add(new Property("sequenceLocation", "MolecularDefinitionLocationSequenceLocationComponent", "A location on a sequence, defined using a nucleotide coordinate system.", 0, 1, sequenceLocation));
            children.add(new Property("cytobandLocation", "MolecularDefinitionLocationCytobandLocationComponent", "A location on a sequence, defined using cytobands.", 0, 1, cytobandLocation));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
            switch (_hash) {
                case -322229610: // sequenceLocation
                    return new Property("sequenceLocation", "MolecularDefinitionLocationSequenceLocationComponent", "A location on a sequence, defined using a nucleotide coordinate system.", 0, 1, sequenceLocation);
                case 730478843: // cytobandLocation
                    return new Property("cytobandLocation", "MolecularDefinitionLocationCytobandLocationComponent", "A location on a sequence, defined using cytobands.", 0, 1, cytobandLocation);
                default:
                    return super.getNamedProperty(_hash, _name, _checkValid);
            }
        }

        @Override
        public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
            switch (hash) {
                case -322229610: // sequenceLocation
                    return this.sequenceLocation == null ? new Base[0] : new Base[]{this.sequenceLocation};
                case 730478843: // cytobandLocation
                    return this.cytobandLocation == null ? new Base[0] : new Base[]{this.cytobandLocation};
                default:
                    return super.getProperty(hash, name, checkValid);
            }
        }

        @Override
        public Base setProperty(int hash, String name, Base value) throws FHIRException {
            switch (hash) {
                case -322229610: // sequenceLocation
                    this.sequenceLocation = (MolecularDefinitionLocationSequenceLocationComponent) value; // Explicit casting
                    return value;
                case 730478843: // cytobandLocation
                    this.cytobandLocation = (MolecularDefinitionLocationCytobandLocationComponent) value; // Explicit casting
                    return value;
                default:
                    return super.setProperty(hash, name, value);
            }
        }

        @Override
        public Base setProperty(String name, Base value) throws FHIRException {
            if (name.equals("sequenceLocation")) {
                this.sequenceLocation = (MolecularDefinitionLocationSequenceLocationComponent) value; // Explicit casting
            } else if (name.equals("cytobandLocation")) {
                this.cytobandLocation = (MolecularDefinitionLocationCytobandLocationComponent) value; // Explicit casting
            } else {
                return super.setProperty(name, value);
            }
            return value;
        }

        @Override
        public Base makeProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case -322229610: // sequenceLocation
                    return getSequenceLocation();
                case 730478843: // cytobandLocation
                    return getCytobandLocation();
                default:
                    return super.makeProperty(hash, name);
            }
        }

        @Override
        public String[] getTypesForProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case -322229610: /* sequenceLocation */
                    return new String[]{"MolecularDefinitionLocationSequenceLocationComponent"};
                case 730478843: /* cytobandLocation */
                    return new String[]{"MolecularDefinitionLocationCytobandLocationComponent"};
                default:
                    return super.getTypesForProperty(hash, name);
            }
        }

        @Override
        public Base addChild(String name) throws FHIRException {
            if (name.equals("sequenceLocation")) {
                this.sequenceLocation = new MolecularDefinitionLocationSequenceLocationComponent();
                return this.sequenceLocation;
            } else if (name.equals("cytobandLocation")) {
                this.cytobandLocation = new MolecularDefinitionLocationCytobandLocationComponent();
                return this.cytobandLocation;
            } else {
                return super.addChild(name);
            }
        }

        @Override
        public void removeChild(String name, Base value) throws FHIRException {
            if (name.equals("sequenceLocation")) {
                this.sequenceLocation = null;
            } else if (name.equals("cytobandLocation")) {
                this.cytobandLocation = null;
            } else {
                super.removeChild(name, value);
            }
        }

        public void copyValues(MolecularDefinitionLocationComponent dst) {
            super.copyValues(dst);
            if (dst instanceof MolecularDefinitionLocationComponent) {
                MolecularDefinitionLocationComponent target = (MolecularDefinitionLocationComponent) dst;
                target.sequenceLocation = this.sequenceLocation == null ? null : this.sequenceLocation.copy();
                target.cytobandLocation = this.cytobandLocation == null ? null : this.cytobandLocation.copy();
            }
        }

        @Override
        public boolean equalsDeep(Base other_) {
            if (!super.equalsDeep(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionLocationComponent))
                return false;
            MolecularDefinitionLocationComponent o = (MolecularDefinitionLocationComponent) other_;
            return compareDeep(sequenceLocation, o.sequenceLocation, true) &&
                    compareDeep(cytobandLocation, o.cytobandLocation, true);
        }

        @Override
        public boolean equalsShallow(Base other_) {
            if (!super.equalsShallow(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionLocationComponent))
                return false;
            MolecularDefinitionLocationComponent o = (MolecularDefinitionLocationComponent) other_;
            return true;
        }

        @Override
        public boolean isEmpty() {
            return super.isEmpty() &&
                    (sequenceLocation == null || sequenceLocation.isEmpty()) &&
                    (cytobandLocation == null || cytobandLocation.isEmpty());
        }

        @Override
        public String fhirType() {
            return "MolecularDefinitionLocationComponent";
        }

        public MolecularDefinitionLocationComponent copy() {
            MolecularDefinitionLocationComponent dst = new MolecularDefinitionLocationComponent();
            copyValues(dst);
            return dst;
        }
    }

    @Block
    public static class MolecularDefinitionRepresentationLiteralComponent extends BackboneElement implements IBaseBackboneElement {

        /**
         * The encoding used for the expression of the entity. For a primary sequence, this element represents the alphabet used (e.g., 1 character DNA without ambiguity codes, 3 character amino acid codes).
         */
        @Child(name = "encoding", type = {CodeableConcept.class}, order = 0, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "The encoding used in the value", formalDefinition = "The encoding used for the expression of the entity. For a primary sequence, this element represents the alphabet used (e.g., 1 character DNA without ambiguity codes, 3 character amino acid codes).")
        protected CodeableConcept encoding;

        /**
         * A string literal representation of the molecular entity, using a specific encoding. For example, this may be the primary sequence of a strand of DNA.
         */
        @Child(name = "value", type = {StringType.class}, order = 1, min = 1, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "A string literal representation of the molecular entity, using the encoding specified in encoding", formalDefinition = "A string literal representation of the molecular entity, using a specific encoding. For example, this may be the primary sequence of a strand of DNA.")
        protected StringType value;

        private static final long serialVersionUID = 5623546582354L;

        /**
         * Constructor
         */
        public MolecularDefinitionRepresentationLiteralComponent() {
            super();
        }

        /**
         * @return {@link #encoding} (The encoding used for the expression of the entity.)
         */
        public CodeableConcept getEncoding() {
            if (this.encoding == null) {
                this.encoding = new CodeableConcept(); // Lazy initialization
            }
            return this.encoding;
        }

        /**
         * @param value {@link #encoding} (The encoding used for the expression of the entity.)
         */
        public MolecularDefinitionRepresentationLiteralComponent setEncoding(CodeableConcept value) {
            this.encoding = value;
            return this;
        }

        /**
         * @return {@link #value} (A string literal representation of the molecular entity.)
         */
        public StringType getValue() {
            if (this.value == null) {
                this.value = new StringType(); // Lazy initialization
            }
            return this.value;
        }

        /**
         * @param value {@link #value} (A string literal representation of the molecular entity.)
         */
        public MolecularDefinitionRepresentationLiteralComponent setValue(StringType value) {
            this.value = value;
            return this;
        }

        public boolean hasEncoding() {
            return this.encoding != null && !this.encoding.isEmpty();
        }

        public boolean hasValue() {
            return this.value != null && !this.value.isEmpty();
        }

        @Override
        protected void listChildren(List<Property> children) {
            super.listChildren(children);
            children.add(new Property("encoding", "CodeableConcept", "The encoding used for the expression of the entity.", 0, 1, encoding));
            children.add(new Property("value", "string", "A string literal representation of the molecular entity.", 1, 1, value));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
            switch (_hash) {
                case 1711222099: // encoding
                    return new Property("encoding", "CodeableConcept", "The encoding used for the expression of the entity.", 0, 1, encoding);
                case 111972721: // value
                    return new Property("value", "string", "A string literal representation of the molecular entity.", 1, 1, value);
                default:
                    return super.getNamedProperty(_hash, _name, _checkValid);
            }
        }

        @Override
        public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
            switch (hash) {
                case 1711222099: // encoding
                    return this.encoding == null ? new Base[0] : new Base[]{this.encoding};
                case 111972721: // value
                    return this.value == null ? new Base[0] : new Base[]{this.value};
                default:
                    return super.getProperty(hash, name, checkValid);
            }
        }

        @Override
        public Base setProperty(int hash, String name, Base value) throws FHIRException {
            switch (hash) {
                case 1711222099: // encoding
                    this.encoding = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
                    return value;
                case 111972721: // value
                    this.value = TypeConvertor.castToString(value); // StringType
                    return value;
                default:
                    return super.setProperty(hash, name, value);
            }
        }

        @Override
        public Base setProperty(String name, Base value) throws FHIRException {
            if (name.equals("encoding")) {
                this.encoding = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
            } else if (name.equals("value")) {
                this.value = TypeConvertor.castToString(value); // StringType
            } else {
                return super.setProperty(name, value);
            }
            return value;
        }

        @Override
        public Base makeProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case 1711222099: // encoding
                    return getEncoding();
                case 111972721: // value
                    return getValue();
                default:
                    return super.makeProperty(hash, name);
            }
        }

        @Override
        public String[] getTypesForProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case 1711222099: /* encoding */
                    return new String[]{"CodeableConcept"};
                case 111972721: /* value */
                    return new String[]{"string"};
                default:
                    return super.getTypesForProperty(hash, name);
            }
        }

        @Override
        public Base addChild(String name) throws FHIRException {
            if (name.equals("encoding")) {
                this.encoding = new CodeableConcept();
                return this.encoding;
            } else if (name.equals("value")) {
                throw new FHIRException("Cannot call addChild on a primitive type MolecularDefinitionRepresentationLiteralComponent.value");
            } else {
                return super.addChild(name);
            }
        }

        @Override
        public void removeChild(String name, Base value) throws FHIRException {
            if (name.equals("encoding")) {
                this.encoding = null;
            } else if (name.equals("value")) {
                this.value = null;
            } else {
                super.removeChild(name, value);
            }
        }

        public void copyValues(MolecularDefinitionRepresentationLiteralComponent dst) {
            super.copyValues(dst);
            if (dst instanceof MolecularDefinitionRepresentationLiteralComponent) {
                MolecularDefinitionRepresentationLiteralComponent target = (MolecularDefinitionRepresentationLiteralComponent) dst;
                target.encoding = this.encoding == null ? null : this.encoding.copy();
                target.value = this.value == null ? null : this.value.copy();
            }
        }

        @Override
        public boolean equalsDeep(Base other_) {
            if (!super.equalsDeep(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionRepresentationLiteralComponent))
                return false;
            MolecularDefinitionRepresentationLiteralComponent o = (MolecularDefinitionRepresentationLiteralComponent) other_;
            return compareDeep(encoding, o.encoding, true) && compareDeep(value, o.value, true);
        }

        @Override
        public boolean equalsShallow(Base other_) {
            if (!super.equalsShallow(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionRepresentationLiteralComponent))
                return false;
            MolecularDefinitionRepresentationLiteralComponent o = (MolecularDefinitionRepresentationLiteralComponent) other_;
            return compareValues(value, o.value, true);
        }

        @Override
        public boolean isEmpty() {
            return super.isEmpty() &&
                    (encoding == null || encoding.isEmpty()) &&
                    (value == null || value.isEmpty());
        }

        @Override
        public String fhirType() {
            return "MolecularDefinitionRepresentationLiteralComponent";
        }

        public MolecularDefinitionRepresentationLiteralComponent copy() {
            MolecularDefinitionRepresentationLiteralComponent dst = new MolecularDefinitionRepresentationLiteralComponent();
            copyValues(dst);
            return dst;
        }
    }

    @Block
    public static class MolecularDefinitionRepresentationExtractedComponent extends BackboneElement implements IBaseBackboneElement {

        /**
         * A reference to the molecular entity that serves as the conceptual 'parent' from which the intended entity is derived. For example, this could be a chromosome sequence on which a coordinateInterval is defined.
         */
        @Child(name = "startingMolecule", type = {MolecularDefinition.class}, order = 0, min = 1, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "The molecular entity that serves as the conceptual 'parent' from which the intended entity is derived", formalDefinition = "A reference to the molecular entity that serves as the conceptual 'parent' from which the intended entity is derived. For example, this could be a chromosome sequence on which a coordinateInterval is defined.")
        protected Reference startingMolecule;

        /**
         * The interval on startingMolecule that defines the portion to be extracted in order to create the intended entity.
         */
        @Child(name = "coordinateInterval", type = {MolecularDefinitionCoordinateIntervalComponent.class}, order = 1, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "The interval on startingMolecule that defines the portion to be extracted in order to create the intended entity.", formalDefinition = "The interval on startingMolecule that defines the portion to be extracted in order to create the intended entity.")
        protected MolecularDefinitionCoordinateIntervalComponent coordinateInterval;

        /**
         * A flag that indicates whether the extracted sequence should be reverse complemented in order to produce the intended entity. This element is only relevant to molecular entities that support the concept of reverse complement (e.g., double stranded DNA).
         */
        @Child(name = "reverseComplement", type = {BooleanType.class}, order = 2, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "A flag that indicates whether the extracted sequence should be reverse complemented", formalDefinition = "A flag that indicates whether the extracted sequence should be reverse complemented in order to produce the intended entity. This element is only relevant to molecular entities that support the concept of reverse complement (e.g., double stranded DNA).")
        protected BooleanType reverseComplement;

        private static final long serialVersionUID = 1L;

        /**
         * Constructor
         */
        public MolecularDefinitionRepresentationExtractedComponent() {
            super();
        }

        /**
         * Constructor with required properties
         */
        public MolecularDefinitionRepresentationExtractedComponent(Reference startingMolecule) {
            super();
            this.startingMolecule = startingMolecule;
        }

        /**
         * @return {@link #startingMolecule} (The reference to the starting molecule.)
         */
        public Reference getStartingMolecule() {
            if (this.startingMolecule == null) {
                this.startingMolecule = new Reference(); // Lazy initialization
            }
            return this.startingMolecule;
        }

        /**
         * @param value {@link #startingMolecule} (The reference to the starting molecule.)
         */
        public MolecularDefinitionRepresentationExtractedComponent setStartingMolecule(Reference value) {
            this.startingMolecule = value;
            return this;
        }

        /**
         * @return {@link #coordinateInterval} (The interval on startingMolecule.)
         */
        public MolecularDefinitionCoordinateIntervalComponent getCoordinateInterval() {
            if (this.coordinateInterval == null) {
                this.coordinateInterval = new MolecularDefinitionCoordinateIntervalComponent(); // Lazy initialization
            }
            return this.coordinateInterval;
        }

        /**
         * @param value {@link #coordinateInterval} (The interval on startingMolecule.)
         */
        public MolecularDefinitionRepresentationExtractedComponent setCoordinateInterval(MolecularDefinitionCoordinateIntervalComponent value) {
            this.coordinateInterval = value;
            return this;
        }

        /**
         * @return {@link #reverseComplement} (Whether the extracted sequence should be reverse complemented.)
         */
        public BooleanType getReverseComplement() {
            if (this.reverseComplement == null) {
                this.reverseComplement = new BooleanType(); // Lazy initialization
            }
            return this.reverseComplement;
        }

        /**
         * @param value {@link #reverseComplement} (Whether the extracted sequence should be reverse complemented.)
         */
        public MolecularDefinitionRepresentationExtractedComponent setReverseComplement(BooleanType value) {
            this.reverseComplement = value;
            return this;
        }

        public boolean hasStartingMolecule() {
            return this.startingMolecule != null && !this.startingMolecule.isEmpty();
        }

        public boolean hasCoordinateInterval() {
            return this.coordinateInterval != null && !this.coordinateInterval.isEmpty();
        }

        public boolean hasReverseComplement() {
            return this.reverseComplement != null && !this.reverseComplement.isEmpty();
        }

        @Override
        protected void listChildren(List<Property> children) {
            super.listChildren(children);
            children.add(new Property("startingMolecule", "Reference", "The reference to the starting molecule.", 1, 1, startingMolecule));
            children.add(new Property("coordinateInterval", "MolecularDefinitionCoordinateIntervalComponent", "The interval on startingMolecule.", 0, 1, coordinateInterval));
            children.add(new Property("reverseComplement", "boolean", "Whether the extracted sequence should be reverse complemented.", 0, 1, reverseComplement));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
            switch (_hash) {
                case -246399258: // startingMolecule
                    return new Property("startingMolecule", "Reference", "The reference to the starting molecule.", 1, 1, startingMolecule);
                case -310065571: // coordinateInterval
                    return new Property("coordinateInterval", "MolecularDefinitionCoordinateIntervalComponent", "The interval on startingMolecule.", 0, 1, coordinateInterval);
                case 834806440: // reverseComplement
                    return new Property("reverseComplement", "boolean", "Whether the extracted sequence should be reverse complemented.", 0, 1, reverseComplement);
                default:
                    return super.getNamedProperty(_hash, _name, _checkValid);
            }
        }

        @Override
        public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
            switch (hash) {
                case -246399258: // startingMolecule
                    return this.startingMolecule == null ? new Base[0] : new Base[]{this.startingMolecule};
                case -310065571: // coordinateInterval
                    return this.coordinateInterval == null ? new Base[0] : new Base[]{this.coordinateInterval};
                case 834806440: // reverseComplement
                    return this.reverseComplement == null ? new Base[0] : new Base[]{this.reverseComplement};
                default:
                    return super.getProperty(hash, name, checkValid);
            }
        }

        @Override
        public Base setProperty(int hash, String name, Base value) throws FHIRException {
            switch (hash) {
                case -246399258: // startingMolecule
                    this.startingMolecule = TypeConvertor.castToReference(value); // Reference
                    return value;
                case -310065571: // coordinateInterval
                    this.coordinateInterval = (MolecularDefinitionCoordinateIntervalComponent) value; // Explicit casting
                    return value;
                case 834806440: // reverseComplement
                    this.reverseComplement = TypeConvertor.castToBoolean(value); // BooleanType
                    return value;
                default:
                    return super.setProperty(hash, name, value);
            }
        }

        @Override
        public Base setProperty(String name, Base value) throws FHIRException {
            if (name.equals("startingMolecule")) {
                this.startingMolecule = TypeConvertor.castToReference(value); // Reference
            } else if (name.equals("coordinateInterval")) {
                this.coordinateInterval = (MolecularDefinitionCoordinateIntervalComponent) value; // Explicit casting
            } else if (name.equals("reverseComplement")) {
                this.reverseComplement = TypeConvertor.castToBoolean(value); // BooleanType
            } else {
                return super.setProperty(name, value);
            }
            return value;
        }

        @Override
        public Base makeProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case -246399258: // startingMolecule
                    return getStartingMolecule();
                case -310065571: // coordinateInterval
                    return getCoordinateInterval();
                case 834806440: // reverseComplement
                    return getReverseComplement();
                default:
                    return super.makeProperty(hash, name);
            }
        }

        @Override
        public String[] getTypesForProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case -246399258: /* startingMolecule */
                    return new String[]{"Reference"};
                case -310065571: /* coordinateInterval */
                    return new String[]{"MolecularDefinitionCoordinateIntervalComponent"};
                case 834806440: /* reverseComplement */
                    return new String[]{"boolean"};
                default:
                    return super.getTypesForProperty(hash, name);
            }
        }

        @Override
        public Base addChild(String name) throws FHIRException {
            if (name.equals("startingMolecule")) {
                this.startingMolecule = new Reference();
                return this.startingMolecule;
            } else if (name.equals("coordinateInterval")) {
                this.coordinateInterval = new MolecularDefinitionCoordinateIntervalComponent();
                return this.coordinateInterval;
            } else if (name.equals("reverseComplement")) {
                throw new FHIRException("Cannot call addChild on a primitive type MolecularDefinitionRepresentationExtractedComponent.reverseComplement");
            } else {
                return super.addChild(name);
            }
        }

        @Override
        public void removeChild(String name, Base value) throws FHIRException {
            if (name.equals("startingMolecule")) {
                this.startingMolecule = null;
            } else if (name.equals("coordinateInterval")) {
                this.coordinateInterval = null;
            } else if (name.equals("reverseComplement")) {
                this.reverseComplement = null;
            } else {
                super.removeChild(name, value);
            }
        }

        public void copyValues(MolecularDefinitionRepresentationExtractedComponent dst) {
            super.copyValues(dst);
            if (dst instanceof MolecularDefinitionRepresentationExtractedComponent) {
                MolecularDefinitionRepresentationExtractedComponent target = (MolecularDefinitionRepresentationExtractedComponent) dst;
                target.startingMolecule = this.startingMolecule == null ? null : this.startingMolecule.copy();
                target.coordinateInterval = this.coordinateInterval == null ? null : this.coordinateInterval.copy();
                target.reverseComplement = this.reverseComplement == null ? null : this.reverseComplement.copy();
            }
        }

        @Override
        public boolean equalsDeep(Base other_) {
            if (!super.equalsDeep(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionRepresentationExtractedComponent))
                return false;
            MolecularDefinitionRepresentationExtractedComponent o = (MolecularDefinitionRepresentationExtractedComponent) other_;
            return compareDeep(startingMolecule, o.startingMolecule, true) &&
                    compareDeep(coordinateInterval, o.coordinateInterval, true) &&
                    compareDeep(reverseComplement, o.reverseComplement, true);
        }

        @Override
        public boolean equalsShallow(Base other_) {
            if (!super.equalsShallow(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionRepresentationExtractedComponent))
                return false;
            MolecularDefinitionRepresentationExtractedComponent o = (MolecularDefinitionRepresentationExtractedComponent) other_;
            return true;
        }

        @Override
        public boolean isEmpty() {
            return super.isEmpty() &&
                    (startingMolecule == null || startingMolecule.isEmpty()) &&
                    (coordinateInterval == null || coordinateInterval.isEmpty()) &&
                    (reverseComplement == null || reverseComplement.isEmpty());
        }

        @Override
        public String fhirType() {
            return "MolecularDefinitionRepresentationExtractedComponent";
        }

        public MolecularDefinitionRepresentationExtractedComponent copy() {
            MolecularDefinitionRepresentationExtractedComponent dst = new MolecularDefinitionRepresentationExtractedComponent();
            copyValues(dst);
            return dst;
        }
    }

    @Block
    public static class MolecularDefinitionRepresentationRepeatedComponent extends BackboneElement implements IBaseBackboneElement {

        /**
         * The motif that is repeated in tandem, which ultimately defines the intended molecular entity.
         */
        @Child(name = "sequenceMotif", type = {MolecularDefinition.class}, order = 0, min = 1, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "The motif that is repeated", formalDefinition = "The motif that is repeated in tandem, which ultimately defines the intended molecular entity.")
        protected Reference sequenceMotif;

        /**
         * The number of times the motif is repeated to create the intended molecular entity.
         */
        @Child(name = "copyCount", type = {IntegerType.class}, order = 1, min = 1, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "The number of copies of the motif", formalDefinition = "The number of times the motif is repeated to create the intended molecular entity.")
        protected IntegerType copyCount;

        private static final long serialVersionUID = 1L;

        /**
         * Constructor
         */
        public MolecularDefinitionRepresentationRepeatedComponent() {
            super();
        }

        /**
         * Constructor with required properties
         */
        public MolecularDefinitionRepresentationRepeatedComponent(Reference sequenceMotif, IntegerType copyCount) {
            super();
            this.sequenceMotif = sequenceMotif;
            this.copyCount = copyCount;
        }

        /**
         * @return {@link #sequenceMotif} (The motif that is repeated.)
         */
        public Reference getSequenceMotif() {
            if (this.sequenceMotif == null) {
                this.sequenceMotif = new Reference(); // Lazy initialization
            }
            return this.sequenceMotif;
        }

        /**
         * @param value {@link #sequenceMotif} (The motif that is repeated.)
         */
        public MolecularDefinitionRepresentationRepeatedComponent setSequenceMotif(Reference value) {
            this.sequenceMotif = value;
            return this;
        }

        /**
         * @return {@link #copyCount} (The number of times the motif is repeated.)
         */
        public IntegerType getCopyCount() {
            if (this.copyCount == null) {
                this.copyCount = new IntegerType(); // Lazy initialization
            }
            return this.copyCount;
        }

        /**
         * @param value {@link #copyCount} (The number of times the motif is repeated.)
         */
        public MolecularDefinitionRepresentationRepeatedComponent setCopyCount(IntegerType value) {
            this.copyCount = value;
            return this;
        }

        public boolean hasSequenceMotif() {
            return this.sequenceMotif != null && !this.sequenceMotif.isEmpty();
        }

        public boolean hasCopyCount() {
            return this.copyCount != null && !this.copyCount.isEmpty();
        }

        @Override
        protected void listChildren(List<Property> children) {
            super.listChildren(children);
            children.add(new Property("sequenceMotif", "Reference", "The motif that is repeated.", 1, 1, sequenceMotif));
            children.add(new Property("copyCount", "integer", "The number of times the motif is repeated.", 1, 1, copyCount));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
            switch (_hash) {
                case -737509266: // sequenceMotif
                    return new Property("sequenceMotif", "Reference", "The motif that is repeated.", 1, 1, sequenceMotif);
                case 1479676570: // copyCount
                    return new Property("copyCount", "integer", "The number of times the motif is repeated.", 1, 1, copyCount);
                default:
                    return super.getNamedProperty(_hash, _name, _checkValid);
            }
        }

        @Override
        public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
            switch (hash) {
                case -737509266: // sequenceMotif
                    return this.sequenceMotif == null ? new Base[0] : new Base[]{this.sequenceMotif};
                case 1479676570: // copyCount
                    return this.copyCount == null ? new Base[0] : new Base[]{this.copyCount};
                default:
                    return super.getProperty(hash, name, checkValid);
            }
        }

        @Override
        public Base setProperty(int hash, String name, Base value) throws FHIRException {
            switch (hash) {
                case -737509266: // sequenceMotif
                    this.sequenceMotif = TypeConvertor.castToReference(value); // Reference
                    return value;
                case 1479676570: // copyCount
                    this.copyCount = TypeConvertor.castToInteger(value); // IntegerType
                    return value;
                default:
                    return super.setProperty(hash, name, value);
            }
        }

        @Override
        public Base setProperty(String name, Base value) throws FHIRException {
            if (name.equals("sequenceMotif")) {
                this.sequenceMotif = TypeConvertor.castToReference(value); // Reference
            } else if (name.equals("copyCount")) {
                this.copyCount = TypeConvertor.castToInteger(value); // IntegerType
            } else {
                return super.setProperty(name, value);
            }
            return value;
        }

        @Override
        public Base makeProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case -737509266: // sequenceMotif
                    return getSequenceMotif();
                case 1479676570: // copyCount
                    return getCopyCount();
                default:
                    return super.makeProperty(hash, name);
            }
        }

        @Override
        public String[] getTypesForProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case -737509266: /* sequenceMotif */
                    return new String[]{"Reference"};
                case 1479676570: /* copyCount */
                    return new String[]{"integer"};
                default:
                    return super.getTypesForProperty(hash, name);
            }
        }

        @Override
        public Base addChild(String name) throws FHIRException {
            if (name.equals("sequenceMotif")) {
                this.sequenceMotif = new Reference();
                return this.sequenceMotif;
            } else if (name.equals("copyCount")) {
                throw new FHIRException("Cannot call addChild on a primitive type MolecularDefinitionRepresentationRepeatedComponent.copyCount");
            } else {
                return super.addChild(name);
            }
        }

        @Override
        public void removeChild(String name, Base value) throws FHIRException {
            if (name.equals("sequenceMotif")) {
                this.sequenceMotif = null;
            } else if (name.equals("copyCount")) {
                this.copyCount = null;
            } else {
                super.removeChild(name, value);
            }
        }

        public void copyValues(MolecularDefinitionRepresentationRepeatedComponent dst) {
            super.copyValues(dst);
            if (dst instanceof MolecularDefinitionRepresentationRepeatedComponent) {
                MolecularDefinitionRepresentationRepeatedComponent target = (MolecularDefinitionRepresentationRepeatedComponent) dst;
                target.sequenceMotif = this.sequenceMotif == null ? null : this.sequenceMotif.copy();
                target.copyCount = this.copyCount == null ? null : this.copyCount.copy();
            }
        }

        @Override
        public boolean equalsDeep(Base other_) {
            if (!super.equalsDeep(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionRepresentationRepeatedComponent))
                return false;
            MolecularDefinitionRepresentationRepeatedComponent o = (MolecularDefinitionRepresentationRepeatedComponent) other_;
            return compareDeep(sequenceMotif, o.sequenceMotif, true) && compareDeep(copyCount, o.copyCount, true);
        }

        @Override
        public boolean equalsShallow(Base other_) {
            if (!super.equalsShallow(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionRepresentationRepeatedComponent))
                return false;
            MolecularDefinitionRepresentationRepeatedComponent o = (MolecularDefinitionRepresentationRepeatedComponent) other_;
            return compareValues(copyCount, o.copyCount, true);
        }

        @Override
        public boolean isEmpty() {
            return super.isEmpty() &&
                    (sequenceMotif == null || sequenceMotif.isEmpty()) &&
                    (copyCount == null || copyCount.isEmpty());
        }

        @Override
        public String fhirType() {
            return "MolecularDefinitionRepresentationRepeatedComponent";
        }

        public MolecularDefinitionRepresentationRepeatedComponent copy() {
            MolecularDefinitionRepresentationRepeatedComponent dst = new MolecularDefinitionRepresentationRepeatedComponent();
            copyValues(dst);
            return dst;
        }
    }

    @Block
    public static class MolecularDefinitionRepresentationSequenceElementComponent extends BackboneElement implements IBaseBackboneElement {

        /**
         * The motif that is repeated in tandem, which ultimately defines the intended molecular entity.
         */
        @Child(name = "sequence", type = {MolecularDefinition.class}, order = 0, min = 1, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "A reference to the sequence that defines this specific concatenated element", formalDefinition = "A reference to the sequence that defines this specific concatenated element.")
        protected Reference sequence;

        /**
         * The motif that is repeated in tandem, which ultimately defines the intended molecular entity.
         */
        @Child(name = "ordinalIndex", type = {IntegerType.class}, order = 1, min = 1, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "The ordinal index of the element within the concatenated representation", formalDefinition = "The ordinal index of the element within the concatenated representation.")
        protected IntegerType ordinalIndex;

        private static final long serialVersionUID = 1L;

        /**
         * Constructor
         */
        public MolecularDefinitionRepresentationSequenceElementComponent() {
            super();
        }

        /**
         * Constructor with required properties
         */
        public MolecularDefinitionRepresentationSequenceElementComponent(Reference sequence, IntegerType ordinalIndex) {
            super();
            this.sequence = sequence;
            this.ordinalIndex = ordinalIndex;
        }

        /**
         * @return {@link #sequence} (The reference to the sequence.)
         */
        public Reference getSequence() {
            if (this.sequence == null) {
                this.sequence = new Reference(); // Lazy initialization
            }
            return this.sequence;
        }

        /**
         * @param value {@link #sequence} (The reference to the sequence.)
         */
        public MolecularDefinitionRepresentationSequenceElementComponent setSequence(Reference value) {
            this.sequence = value;
            return this;
        }

        /**
         * @return {@link #ordinalIndex} (The ordinal index of the element.)
         */
        public IntegerType getOrdinalIndex() {
            if (this.ordinalIndex == null) {
                this.ordinalIndex = new IntegerType(); // Lazy initialization
            }
            return this.ordinalIndex;
        }

        /**
         * @param value {@link #ordinalIndex} (The ordinal index of the element.)
         */
        public MolecularDefinitionRepresentationSequenceElementComponent setOrdinalIndex(IntegerType value) {
            this.ordinalIndex = value;
            return this;
        }

        public boolean hasSequence() {
            return this.sequence != null && !this.sequence.isEmpty();
        }

        public boolean hasOrdinalIndex() {
            return this.ordinalIndex != null && !this.ordinalIndex.isEmpty();
        }

        @Override
        protected void listChildren(List<Property> children) {
            super.listChildren(children);
            children.add(new Property("sequence", "Reference", "A reference to the sequence.", 1, 1, sequence));
            children.add(new Property("ordinalIndex", "integer", "The ordinal index of the element.", 1, 1, ordinalIndex));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
            switch (_hash) {
                case 1349547969: // sequence
                    return new Property("sequence", "Reference", "A reference to the sequence.", 1, 1, sequence);
                case 1260477665: // ordinalIndex
                    return new Property("ordinalIndex", "integer", "The ordinal index of the element.", 1, 1, ordinalIndex);
                default:
                    return super.getNamedProperty(_hash, _name, _checkValid);
            }
        }

        @Override
        public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
            switch (hash) {
                case 1349547969: // sequence
                    return this.sequence == null ? new Base[0] : new Base[]{this.sequence};
                case 1260477665: // ordinalIndex
                    return this.ordinalIndex == null ? new Base[0] : new Base[]{this.ordinalIndex};
                default:
                    return super.getProperty(hash, name, checkValid);
            }
        }

        @Override
        public Base setProperty(int hash, String name, Base value) throws FHIRException {
            switch (hash) {
                case 1349547969: // sequence
                    this.sequence = TypeConvertor.castToReference(value); // Reference
                    return value;
                case 1260477665: // ordinalIndex
                    this.ordinalIndex = TypeConvertor.castToInteger(value); // IntegerType
                    return value;
                default:
                    return super.setProperty(hash, name, value);
            }
        }

        @Override
        public Base setProperty(String name, Base value) throws FHIRException {
            if (name.equals("sequence")) {
                this.sequence = TypeConvertor.castToReference(value); // Reference
            } else if (name.equals("ordinalIndex")) {
                this.ordinalIndex = TypeConvertor.castToInteger(value); // IntegerType
            } else {
                return super.setProperty(name, value);
            }
            return value;
        }

        @Override
        public Base makeProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case 1349547969: // sequence
                    return getSequence();
                case 1260477665: // ordinalIndex
                    return getOrdinalIndex();
                default:
                    return super.makeProperty(hash, name);
            }
        }

        @Override
        public String[] getTypesForProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case 1349547969: /* sequence */
                    return new String[]{"Reference"};
                case 1260477665: /* ordinalIndex */
                    return new String[]{"integer"};
                default:
                    return super.getTypesForProperty(hash, name);
            }
        }

        @Override
        public Base addChild(String name) throws FHIRException {
            if (name.equals("sequence")) {
                this.sequence = new Reference();
                return this.sequence;
            } else if (name.equals("ordinalIndex")) {
                this.ordinalIndex = new IntegerType();
                return this.ordinalIndex;
            } else {
                return super.addChild(name);
            }
        }

        @Override
        public void removeChild(String name, Base value) throws FHIRException {
            if (name.equals("sequence")) {
                this.sequence = null;
            } else if (name.equals("ordinalIndex")) {
                this.ordinalIndex = null;
            } else {
                super.removeChild(name, value);
            }
        }

        public void copyValues(MolecularDefinitionRepresentationSequenceElementComponent dst) {
            super.copyValues(dst);
            if (dst instanceof MolecularDefinitionRepresentationSequenceElementComponent) {
                MolecularDefinitionRepresentationSequenceElementComponent target = (MolecularDefinitionRepresentationSequenceElementComponent) dst;
                target.sequence = this.sequence == null ? null : this.sequence.copy();
                target.ordinalIndex = this.ordinalIndex == null ? null : this.ordinalIndex.copy();
            }
        }

        @Override
        public boolean equalsDeep(Base other_) {
            if (!super.equalsDeep(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionRepresentationSequenceElementComponent))
                return false;
            MolecularDefinitionRepresentationSequenceElementComponent o = (MolecularDefinitionRepresentationSequenceElementComponent) other_;
            return compareDeep(sequence, o.sequence, true) && compareDeep(ordinalIndex, o.ordinalIndex, true);
        }

        @Override
        public boolean equalsShallow(Base other_) {
            if (!super.equalsShallow(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionRepresentationSequenceElementComponent))
                return false;
            MolecularDefinitionRepresentationSequenceElementComponent o = (MolecularDefinitionRepresentationSequenceElementComponent) other_;
            return compareValues(ordinalIndex, o.ordinalIndex, true);
        }

        @Override
        public boolean isEmpty() {
            return super.isEmpty() &&
                    (sequence == null || sequence.isEmpty()) &&
                    (ordinalIndex == null || ordinalIndex.isEmpty());
        }

        @Override
        public String fhirType() {
            return "MolecularDefinitionRepresentationSequenceElementComponent";
        }

        public MolecularDefinitionRepresentationSequenceElementComponent copy() {
            MolecularDefinitionRepresentationSequenceElementComponent dst = new MolecularDefinitionRepresentationSequenceElementComponent();
            copyValues(dst);
            return dst;
        }}

    @Block
    public static class MolecularDefinitionRepresentationConcatenatedComponent extends BackboneElement implements IBaseBackboneElement {

        /**
         * The motif that is repeated in tandem, which ultimately defines the intended molecular entity.
         */
        @Child(name = "sequenceElement", type = {MolecularDefinitionRepresentationSequenceElementComponent.class}, order = 0, min = 1, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "One of the concatenated entities", formalDefinition = "One of the concatenated entities within the concatenated representation.")
        protected MolecularDefinitionRepresentationSequenceElementComponent sequenceElement;

        private static final long serialVersionUID = 1L;

        /**
         * Constructor
         */
        public MolecularDefinitionRepresentationConcatenatedComponent() {
            super();
        }

        /**
         * Constructor with required property
         */
        public MolecularDefinitionRepresentationConcatenatedComponent(MolecularDefinitionRepresentationSequenceElementComponent sequenceElement) {
            super();
            this.sequenceElement = sequenceElement;
        }

        /**
         * @return {@link #sequenceElement} (One of the concatenated entities.)
         */
        public MolecularDefinitionRepresentationSequenceElementComponent getSequenceElement() {
            if (this.sequenceElement == null) {
                this.sequenceElement = new MolecularDefinitionRepresentationSequenceElementComponent(); // Lazy initialization
            }
            return this.sequenceElement;
        }

        /**
         * @param value {@link #sequenceElement} (One of the concatenated entities.)
         */
        public MolecularDefinitionRepresentationConcatenatedComponent setSequenceElement(MolecularDefinitionRepresentationSequenceElementComponent value) {
            this.sequenceElement = value;
            return this;
        }

        public boolean hasSequenceElement() {
            return this.sequenceElement != null && !this.sequenceElement.isEmpty();
        }

        @Override
        protected void listChildren(List<Property> children) {
            super.listChildren(children);
            children.add(new Property("sequenceElement", "MolecularDefinitionRepresentationSequenceElementComponent", "One of the concatenated entities.", 1, 1, sequenceElement));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
            switch (_hash) {
                case 1313485819: // sequenceElement
                    return new Property("sequenceElement", "MolecularDefinitionRepresentationSequenceElementComponent", "One of the concatenated entities.", 1, 1, sequenceElement);
                default:
                    return super.getNamedProperty(_hash, _name, _checkValid);
            }
        }

        @Override
        public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
            switch (hash) {
                case 1313485819: // sequenceElement
                    return this.sequenceElement == null ? new Base[0] : new Base[]{this.sequenceElement};
                default:
                    return super.getProperty(hash, name, checkValid);
            }
        }

        @Override
        public Base setProperty(int hash, String name, Base value) throws FHIRException {
            switch (hash) {
                case 1313485819: // sequenceElement
                    this.sequenceElement = (MolecularDefinitionRepresentationSequenceElementComponent) value; // Explicit casting
                    return value;
                default:
                    return super.setProperty(hash, name, value);
            }
        }

        @Override
        public Base setProperty(String name, Base value) throws FHIRException {
            if (name.equals("sequenceElement")) {
                this.sequenceElement = (MolecularDefinitionRepresentationSequenceElementComponent) value; // Explicit casting
            } else {
                return super.setProperty(name, value);
            }
            return value;
        }

        @Override
        public Base makeProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case 1313485819: // sequenceElement
                    return getSequenceElement();
                default:
                    return super.makeProperty(hash, name);
            }
        }

        @Override
        public String[] getTypesForProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case 1313485819: /* sequenceElement */
                    return new String[]{"MolecularDefinitionRepresentationSequenceElementComponent"};
                default:
                    return super.getTypesForProperty(hash, name);
            }
        }

        @Override
        public Base addChild(String name) throws FHIRException {
            if (name.equals("sequenceElement")) {
                this.sequenceElement = new MolecularDefinitionRepresentationSequenceElementComponent();
                return this.sequenceElement;
            } else {
                return super.addChild(name);
            }
        }

        @Override
        public void removeChild(String name, Base value) throws FHIRException {
            if (name.equals("sequenceElement")) {
                this.sequenceElement = null;
            } else {
                super.removeChild(name, value);
            }
        }

        public void copyValues(MolecularDefinitionRepresentationConcatenatedComponent dst) {
            super.copyValues(dst);
            if (dst instanceof MolecularDefinitionRepresentationConcatenatedComponent) {
                MolecularDefinitionRepresentationConcatenatedComponent target = (MolecularDefinitionRepresentationConcatenatedComponent) dst;
                target.sequenceElement = this.sequenceElement == null ? null : this.sequenceElement.copy();
            }
        }

        @Override
        public boolean equalsDeep(Base other_) {
            if (!super.equalsDeep(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionRepresentationConcatenatedComponent))
                return false;
            MolecularDefinitionRepresentationConcatenatedComponent o = (MolecularDefinitionRepresentationConcatenatedComponent) other_;
            return compareDeep(sequenceElement, o.sequenceElement, true);
        }

        @Override
        public boolean equalsShallow(Base other_) {
            if (!super.equalsShallow(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionRepresentationConcatenatedComponent))
                return false;
            MolecularDefinitionRepresentationConcatenatedComponent o = (MolecularDefinitionRepresentationConcatenatedComponent) other_;
            return true;
        }

        @Override
        public boolean isEmpty() {
            return super.isEmpty() && (sequenceElement == null || sequenceElement.isEmpty());
        }

        @Override
        public String fhirType() {
            return "MolecularDefinitionRepresentationConcatenatedComponent";
        }

        public MolecularDefinitionRepresentationConcatenatedComponent copy() {
            MolecularDefinitionRepresentationConcatenatedComponent dst = new MolecularDefinitionRepresentationConcatenatedComponent();
            copyValues(dst);
            return dst;
        }
    }

    @Block
    public static class MolecularDefinitionRepresentationEditComponent extends BackboneElement implements IBaseBackboneElement {

        /**
         * Defines the order of edits when multiple edits are to be applied to the startingMolecule. This is important when edits may overlap (intervals) or when edits change the length of the entity.
         */
        @Child(name = "editOrder", type = {IntegerType.class}, order = 0, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "Defines the order of edits when multiple edits are to be applied to the startingMolecule", formalDefinition = "Defines the order of edits when multiple edits are to be applied to the startingMolecule. This is important when edits may overlap (intervals) or when edits change the length of the entity.")
        protected IntegerType editOrder;

        /**
         * The interval on startingMolecule that defines the portion to be extracted in order to create the intended entity.
         */
        @Child(name = "coordinateInterval", type = {MolecularDefinitionCoordinateIntervalComponent.class}, order = 1, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "The interval on startingMolecule that defines the portion to be extracted to produce the intended entity", formalDefinition = "The interval on startingMolecule that defines the portion to be extracted in order to create the intended entity.")
        protected MolecularDefinitionCoordinateIntervalComponent coordinateInterval;

        /**
         * The molecular entity that serves as the replacement in the edit operation. After the edit has been applied, the state of the entity at the specified coordinateInterval is defined by the state of the replacementMolecule.
         */
        @Child(name = "replacementMolecule", type = {MolecularDefinition.class}, order = 2, min = 1, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "The molecular entity that serves as the replacement in the edit operation", formalDefinition = "The molecular entity that serves as the replacement in the edit operation. After the edit has been applied, the state of the entity at the specified coordinateInterval is defined by the state of the replacementMolecule.")
        protected Reference replacementMolecule;

        /**
         * The portion of the molecular entity that is replaced by the replacementMolecule as a result of the edit. The value of this element can be derived as the state of the entity at the specified coordinateInterval, prior to the edit being applied. It is provided for convenience.
         */
        @Child(name = "replacedMolecule", type = {MolecularDefinition.class}, order = 3, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "The portion of the molecular entity that is replaced by the replacementMolecule", formalDefinition = "The portion of the molecular entity that is replaced by the replacementMolecule as a result of the edit. The value of this element can be derived as the state of the entity at the specified coordinateInterval, prior to the edit being applied. It is provided for convenience.")
        protected Reference replacedMolecule;

        private static final long serialVersionUID = 1L;

        /**
         * Default constructor.
         */
        public MolecularDefinitionRepresentationEditComponent() {
            super();
        }

        /**
         * Constructor with required properties.
         */
        public MolecularDefinitionRepresentationEditComponent(Reference replacementMolecule) {
            super();
            this.replacementMolecule = replacementMolecule;
        }

        public IntegerType getEditOrder() {
            if (this.editOrder == null) {
                this.editOrder = new IntegerType(); // Lazy initialization
            }
            return this.editOrder;
        }

        public MolecularDefinitionRepresentationEditComponent setEditOrder(IntegerType value) {
            this.editOrder = value;
            return this;
        }

        public boolean hasEditOrder() {
            return this.editOrder != null && !this.editOrder.isEmpty();
        }

        public MolecularDefinitionCoordinateIntervalComponent getCoordinateInterval() {
            if (this.coordinateInterval == null) {
                this.coordinateInterval = new MolecularDefinitionCoordinateIntervalComponent(); // Lazy initialization
            }
            return this.coordinateInterval;
        }

        public MolecularDefinitionRepresentationEditComponent setCoordinateInterval(MolecularDefinitionCoordinateIntervalComponent value) {
            this.coordinateInterval = value;
            return this;
        }

        public boolean hasCoordinateInterval() {
            return this.coordinateInterval != null && !this.coordinateInterval.isEmpty();
        }

        public Reference getReplacementMolecule() {
            if (this.replacementMolecule == null) {
                this.replacementMolecule = new Reference(); // Lazy initialization
            }
            return this.replacementMolecule;
        }

        public MolecularDefinitionRepresentationEditComponent setReplacementMolecule(Reference value) {
            this.replacementMolecule = value;
            return this;
        }

        public boolean hasReplacementMolecule() {
            return this.replacementMolecule != null && !this.replacementMolecule.isEmpty();
        }

        public Reference getReplacedMolecule() {
            if (this.replacedMolecule == null) {
                this.replacedMolecule = new Reference(); // Lazy initialization
            }
            return this.replacedMolecule;
        }

        public MolecularDefinitionRepresentationEditComponent setReplacedMolecule(Reference value) {
            this.replacedMolecule = value;
            return this;
        }

        public boolean hasReplacedMolecule() {
            return this.replacedMolecule != null && !this.replacedMolecule.isEmpty();
        }

        @Override
        protected void listChildren(List<Property> children) {
            super.listChildren(children);
            children.add(new Property("editOrder", "integer", "Defines the order of edits when multiple edits are to be applied to the startingMolecule.", 0, 1, editOrder));
            children.add(new Property("coordinateInterval", "MolecularDefinitionCoordinateIntervalComponent", "The interval on startingMolecule that defines the portion to be extracted to produce the intended entity.", 0, 1, coordinateInterval));
            children.add(new Property("replacementMolecule", "Reference", "The molecular entity that serves as the replacement in the edit operation.", 1, 1, replacementMolecule));
            children.add(new Property("replacedMolecule", "Reference", "The portion of the molecular entity that is replaced by the replacementMolecule.", 0, 1, replacedMolecule));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
            switch (_hash) {
                case -1880858780: // editOrder
                    return new Property("editOrder", "integer", "Defines the order of edits when multiple edits are to be applied to the startingMolecule.", 0, 1, editOrder);
                case -310065571: // coordinateInterval
                    return new Property("coordinateInterval", "MolecularDefinitionCoordinateIntervalComponent", "The interval on startingMolecule that defines the portion to be extracted to produce the intended entity.", 0, 1, coordinateInterval);
                case 770226872: // replacementMolecule
                    return new Property("replacementMolecule", "Reference", "The molecular entity that serves as the replacement in the edit operation.", 1, 1, replacementMolecule);
                case 232919766: // replacedMolecule
                    return new Property("replacedMolecule", "Reference", "The portion of the molecular entity that is replaced by the replacementMolecule.", 0, 1, replacedMolecule);
                default:
                    return super.getNamedProperty(_hash, _name, _checkValid);
            }
        }

        @Override
        public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
            switch (hash) {
                case -1880858780: // editOrder
                    return this.editOrder == null ? new Base[0] : new Base[] {this.editOrder};
                case -310065571: // coordinateInterval
                    return this.coordinateInterval == null ? new Base[0] : new Base[] {this.coordinateInterval};
                case 770226872: // replacementMolecule
                    return this.replacementMolecule == null ? new Base[0] : new Base[] {this.replacementMolecule};
                case 232919766: // replacedMolecule
                    return this.replacedMolecule == null ? new Base[0] : new Base[] {this.replacedMolecule};
                default:
                    return super.getProperty(hash, name, checkValid);
            }
        }

        @Override
        public Base setProperty(int hash, String name, Base value) throws FHIRException {
            switch (hash) {
                case -1880858780: // editOrder
                    this.editOrder = TypeConvertor.castToInteger(value);
                    return value;
                case -310065571: // coordinateInterval
                    this.coordinateInterval = (MolecularDefinitionCoordinateIntervalComponent)value;
                    return value;
                case 770226872: // replacementMolecule
                    this.replacementMolecule = TypeConvertor.castToReference(value);
                    return value;
                case 232919766: // replacedMolecule
                    this.replacedMolecule = TypeConvertor.castToReference(value);
                    return value;
                default:
                    return super.setProperty(hash, name, value);
            }
        }

        @Override
        public Base setProperty(String name, Base value) throws FHIRException {
            if (name.equals("editOrder")) {
                this.editOrder = TypeConvertor.castToInteger(value);
            } else if (name.equals("coordinateInterval")) {
                this.coordinateInterval = (MolecularDefinitionCoordinateIntervalComponent)value;
            } else if (name.equals("replacementMolecule")) {
                this.replacementMolecule = TypeConvertor.castToReference(value);
            } else if (name.equals("replacedMolecule")) {
                this.replacedMolecule = TypeConvertor.castToReference(value);
            } else {
                return super.setProperty(name, value);
            }
            return value;
        }

        @Override
        public void removeChild(String name, Base value) throws FHIRException {
            if (name.equals("editOrder")) {
                this.editOrder = null;
            } else if (name.equals("coordinateInterval")) {
                this.coordinateInterval = null;
            } else if (name.equals("replacementMolecule")) {
                this.replacementMolecule = null;
            } else if (name.equals("replacedMolecule")) {
                this.replacedMolecule = null;
            } else {
                super.removeChild(name, value);
            }
        }

        @Override
        public Base makeProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case -1880858780: // editOrder
                    return getEditOrder();
                case -310065571: // coordinateInterval
                    return getCoordinateInterval();
                case 770226872: // replacementMolecule
                    return getReplacementMolecule();
                case 232919766: // replacedMolecule
                    return getReplacedMolecule();
                default:
                    return super.makeProperty(hash, name);
            }
        }

        @Override
        public String[] getTypesForProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case -1880858780: // editOrder
                    return new String[] {"integer"};
                case -310065571: // coordinateInterval
                    return new String[] {"MolecularDefinitionCoordinateIntervalComponent"};
                case 770226872: // replacementMolecule
                    return new String[] {"Reference"};
                case 232919766: // replacedMolecule
                    return new String[] {"Reference"};
                default:
                    return super.getTypesForProperty(hash, name);
            }
        }

        @Override
        public Base addChild(String name) throws FHIRException {
            if (name.equals("editOrder")) {
                this.editOrder = new IntegerType();
                return this.editOrder;
            } else if (name.equals("coordinateInterval")) {
                this.coordinateInterval = new MolecularDefinitionCoordinateIntervalComponent();
                return this.coordinateInterval;
            } else if (name.equals("replacementMolecule")) {
                this.replacementMolecule = new Reference();
                return this.replacementMolecule;
            } else if (name.equals("replacedMolecule")) {
                this.replacedMolecule = new Reference();
                return this.replacedMolecule;
            } else {
                return super.addChild(name);
            }
        }

        public void copyValues(MolecularDefinitionRepresentationEditComponent dst) {
            super.copyValues(dst);
            if (dst instanceof MolecularDefinitionRepresentationEditComponent) {
                MolecularDefinitionRepresentationEditComponent target = (MolecularDefinitionRepresentationEditComponent) dst;
                target.editOrder = this.editOrder == null ? null : this.editOrder.copy();
                target.coordinateInterval = this.coordinateInterval == null ? null : this.coordinateInterval.copy();
                target.replacementMolecule = this.replacementMolecule == null ? null : this.replacementMolecule.copy();
                target.replacedMolecule = this.replacedMolecule == null ? null : this.replacedMolecule.copy();
            }
        }

        @Override
        public boolean equalsDeep(Base other_) {
            if (!super.equalsDeep(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionRepresentationEditComponent))
                return false;
            MolecularDefinitionRepresentationEditComponent o = (MolecularDefinitionRepresentationEditComponent) other_;
            return compareDeep(editOrder, o.editOrder, true) &&
                    compareDeep(coordinateInterval, o.coordinateInterval, true) &&
                    compareDeep(replacementMolecule, o.replacementMolecule, true) &&
                    compareDeep(replacedMolecule, o.replacedMolecule, true);
        }

        @Override
        public boolean equalsShallow(Base other_) {
            if (!super.equalsShallow(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionRepresentationEditComponent))
                return false;
            MolecularDefinitionRepresentationEditComponent o = (MolecularDefinitionRepresentationEditComponent) other_;
            return compareValues(editOrder, o.editOrder, true) ;
        }

        @Override
        public boolean isEmpty() {
            return super.isEmpty() &&
                    (editOrder == null || editOrder.isEmpty()) &&
                    (coordinateInterval == null || coordinateInterval.isEmpty()) &&
                    (replacementMolecule == null || replacementMolecule.isEmpty()) &&
                    (replacedMolecule == null || replacedMolecule.isEmpty());
        }

        @Override
        public String fhirType() {
            return "MolecularDefinitionRepresentationEditComponent";
        }

        public MolecularDefinitionRepresentationEditComponent copy() {
            MolecularDefinitionRepresentationEditComponent dst = new MolecularDefinitionRepresentationEditComponent();
            copyValues(dst);
            return dst;
        }
    }

    @Block
    public static class MolecularDefinitionRepresentationRelativeComponent extends BackboneElement implements IBaseBackboneElement {

        /**
         * The molecular entity that serves as the starting point, on which edits will be applied.
         */
        @Child(name = "startingMolecule", type = {MolecularDefinition.class}, order = 0, min = 1, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "The molecular entity on which edits will be applied", formalDefinition = "The molecular entity that serves as the starting point, on which edits will be applied.")
        protected Reference startingMolecule;

        /**
         * A defined edit (change) to be applied to the molecular entity.
         */
        @Child(name = "edit", type = {MolecularDefinitionRepresentationEditComponent.class}, order = 1, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
        @Description(shortDefinition = "A defined edit (change) to be applied", formalDefinition = "A defined edit (change) to be applied to the molecular entity.")
        protected List<MolecularDefinitionRepresentationEditComponent> edit;

        private static final long serialVersionUID = 1L;

        /**
         * Default constructor.
         */
        public MolecularDefinitionRepresentationRelativeComponent() {
            super();
        }

        /**
         * Constructor with a required property.
         */
        public MolecularDefinitionRepresentationRelativeComponent(Reference startingMolecule) {
            super();
            this.startingMolecule = startingMolecule;
        }

        public Reference getStartingMolecule() {
            if (this.startingMolecule == null) {
                this.startingMolecule = new Reference(); // Lazy initialization
            }
            return this.startingMolecule;
        }

        public MolecularDefinitionRepresentationRelativeComponent setStartingMolecule(Reference value) {
            this.startingMolecule = value;
            return this;
        }

        public boolean hasStartingMolecule() {
            return this.startingMolecule != null && !this.startingMolecule.isEmpty();
        }

        public List<MolecularDefinitionRepresentationEditComponent> getEdit() {
            if (this.edit == null) {
                this.edit = new ArrayList<>(); // Lazy initialization
            }
            return this.edit;
        }

        public MolecularDefinitionRepresentationRelativeComponent setEdit(List<MolecularDefinitionRepresentationEditComponent> value) {
            this.edit = value;
            return this;
        }

        public boolean hasEdit() {
            return this.edit != null && !this.edit.isEmpty();
        }

        public MolecularDefinitionRepresentationRelativeComponent addEdit(MolecularDefinitionRepresentationEditComponent value) {
            if (value == null)
                return this;
            if (this.edit == null)
                this.edit = new ArrayList<MolecularDefinitionRepresentationEditComponent>();
            this.edit.add(value);
            return this;
        }

        public MolecularDefinitionRepresentationEditComponent addEdit() {
            MolecularDefinitionRepresentationEditComponent editComponent = new MolecularDefinitionRepresentationEditComponent();
            if (this.edit == null)
                this.edit = new ArrayList<MolecularDefinitionRepresentationEditComponent>();
            this.edit.add(editComponent);
            return editComponent;
        }

        @Override
        protected void listChildren(List<Property> children) {
            super.listChildren(children);
            children.add(new Property("startingMolecule", "Reference", "The molecular entity on which edits will be applied.", 1, 1, startingMolecule));
            children.add(new Property("edit", "MolecularDefinitionRepresentationEditComponent", "A defined edit (change) to be applied.", 0, Child.MAX_UNLIMITED, edit));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
            switch (_hash) {
                case -246399258: // startingMolecule
                    return new Property("startingMolecule", "Reference", "The molecular entity on which edits will be applied.", 1, 1, startingMolecule);
                case 3108362: // edit
                    return new Property("edit", "MolecularDefinitionRepresentationEditComponent", "A defined edit (change) to be applied.", 0, Child.MAX_UNLIMITED, edit);
                default:
                    return super.getNamedProperty(_hash, _name, _checkValid);
            }
        }

        @Override
        public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
            switch (hash) {
                case -246399258: // startingMolecule
                    return this.startingMolecule == null ? new Base[0] : new Base[]{this.startingMolecule};
                case 3108362: // edit
                    return this.edit == null ? new Base[0] : this.edit.toArray(new Base[this.edit.size()]);
                default:
                    return super.getProperty(hash, name, checkValid);
            }
        }

        @Override
        public Base setProperty(int hash, String name, Base value) throws FHIRException {
            switch (hash) {
                case -246399258: // startingMolecule
                    this.startingMolecule = TypeConvertor.castToReference(value); // Reference
                    return value;
                case 3108362: // edit
                    this.getEdit().add((MolecularDefinitionRepresentationEditComponent) value); // Add to list
                    return value;
                default:
                    return super.setProperty(hash, name, value);
            }
        }

        @Override
        public Base setProperty(String name, Base value) throws FHIRException {
            if (name.equals("startingMolecule")) {
                this.startingMolecule = TypeConvertor.castToReference(value); // Reference
            } else if (name.equals("edit")) {
                this.getEdit().add((MolecularDefinitionRepresentationEditComponent) value); // Add to list
            } else {
                return super.setProperty(name, value);
            }
            return value;
        }

        @Override
        public Base makeProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case -246399258: // startingMolecule
                    return getStartingMolecule();
                case 3108362: // edit
                    return addEdit();
                default:
                    return super.makeProperty(hash, name);
            }
        }

        @Override
        public String[] getTypesForProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case -246399258: /* startingMolecule */
                    return new String[]{"Reference"};
                case 3108362: /* edit */
                    return new String[]{"MolecularDefinitionRepresentationEditComponent"};
                default:
                    return super.getTypesForProperty(hash, name);
            }
        }

        @Override
        public Base addChild(String name) throws FHIRException {
            if (name.equals("startingMolecule")) {
                this.startingMolecule = new Reference();
                return this.startingMolecule;
            } else if (name.equals("edit")) {
                return addEdit();
            } else {
                return super.addChild(name);
            }
        }

        public void copyValues(MolecularDefinitionRepresentationRelativeComponent dst) {
            super.copyValues(dst);
            dst.startingMolecule = startingMolecule == null ? null : startingMolecule.copy();
            if (edit != null) {
                dst.edit = new ArrayList<>();
                for (MolecularDefinitionRepresentationEditComponent e : edit) {
                    dst.edit.add(e.copy());
                }
            }
        }

        @Override
        public boolean equalsDeep(Base other_) {
            if (!super.equalsDeep(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionRepresentationRelativeComponent))
                return false;
            MolecularDefinitionRepresentationRelativeComponent o = (MolecularDefinitionRepresentationRelativeComponent) other_;
            return compareDeep(startingMolecule, o.startingMolecule, true) && compareDeep(edit, o.edit, true);
        }

        @Override
        public boolean equalsShallow(Base other_) {
            if (!super.equalsShallow(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionRepresentationRelativeComponent))
                return false;
            return true;
        }

        @Override
        public boolean isEmpty() {
            return super.isEmpty() && (startingMolecule == null || startingMolecule.isEmpty())
                    && (edit == null || edit.isEmpty());
        }

        @Override
        public String fhirType() {
            return "MolecularDefinitionRepresentationRelativeComponent";
        }


        public MolecularDefinitionRepresentationRelativeComponent copy() {
            MolecularDefinitionRepresentationRelativeComponent dst = new MolecularDefinitionRepresentationRelativeComponent();
            copyValues(dst);
            return dst;
        }
    }

    @Block()
    public static class MolecularDefinitionRepresentationComponent extends BackboneElement implements IBaseBackboneElement {

        /**
         * The domain concept that is the focus of the representation. This element is used to disambiguate the representations of the “reference” and the “alternate” alleles at a given location, for example.
         */
        @Child(name = "focus", type = {CodeableConcept.class}, order = 0, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "The domain concept that is the focus of a given instance of the representation", formalDefinition = "The domain concept that is the focus of the representation. This element is used to disambiguate the representations of the “reference” and the “alternate” alleles at a given location, for example.")
        protected CodeableConcept focus;

        /**
         * A code (e.g., sequence accession number) used to represent a molecular entity.
         */
        @Child(name = "code", type = {CodeableConcept.class}, order = 1, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
        @Description(shortDefinition = "A code (e.g., sequence accession number) used to represent a molecular entity", formalDefinition = "A code (e.g., sequence accession number) used to represent a molecular entity.")
        protected List<CodeableConcept> code;

        /**
         * A molecular entity defined as a string literal.
         */
        @Child(name = "literal", type = {MolecularDefinitionRepresentationLiteralComponent.class}, order = 2, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "A molecular entity defined as a string literal", formalDefinition = "A molecular entity defined as a string literal.")
        protected MolecularDefinitionRepresentationLiteralComponent literal;

        /**
         * A resolvable representation of a molecular entity, which may be specified as a URI and/or attached document (in a defined format).
         */
        @Child(name = "resolvable", type = {DocumentReference.class}, order = 3, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "A resolvable representation of a molecular entity (e.g., URI, attached and formatted file)", formalDefinition = "A resolvable representation of a molecular entity, which may be specified as a URI and/or attached document (in a defined format).")
        protected Reference resolvable;

        /**
         * A molecular entity that is represented as a portion of a different entity. For example, this element can represent a subsequence (e.g., genetic region) that is part of and conceptually extracted from a longer sequence (e.g., chromosome sequence). The “parent” entity is specified in startingMolecule and the location of the intended molecular entity on the parent entity is defined by coordinateInterval.
         */
        @Child(name = "extracted", type = {MolecularDefinitionRepresentationExtractedComponent.class}, order = 4, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "A molecular entity that is represented as a portion of a different entity", formalDefinition = "A molecular entity that is represented as a portion of a different entity. For example, this element can represent a subsequence (e.g., genetic region) that is part of and conceptually extracted from a longer sequence (e.g., chromosome sequence). The “parent” entity is specified in startingMolecule and the location of the intended molecular entity on the parent entity is defined by coordinateInterval.")
        protected MolecularDefinitionRepresentationExtractedComponent extracted;

        /**
         * A representation of a molecular entity that is expressed as a number of copies of a repeated motif.
         */
        @Child(name = "repeated", type = {MolecularDefinitionRepresentationRepeatedComponent.class}, order = 5, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "A representation as a repeated motif", formalDefinition = "A representation of a molecular entity that is expressed as a number of copies of a repeated motif.")
        protected MolecularDefinitionRepresentationRepeatedComponent repeated;

        /**
         * A representation comprised of an ordered concatenation of two or more molecular entities.
         */
        @Child(name = "concatenated", type = {MolecularDefinitionRepresentationConcatenatedComponent.class}, order = 6, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "An ordered concatenation of molecular entities", formalDefinition = "A representation comprised of an ordered concatenation of two or more molecular entities.")
        protected MolecularDefinitionRepresentationConcatenatedComponent concatenated;

        /**
         * A molecular entity represented as an ordered series of edits on a specified starting entity. This representation can be used to define one entity relative to another.
         */
        @Child(name = "relative", type = {MolecularDefinitionRepresentationRelativeComponent.class}, order = 7, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "A molecular entity represented as an ordered series of edits on a specified starting entity", formalDefinition = "A molecular entity represented as an ordered series of edits on a specified starting entity. This representation can be used to define one entity relative to another.")
        protected MolecularDefinitionRepresentationRelativeComponent relative;

        private static final long serialVersionUID = 1L;

        public MolecularDefinitionRepresentationComponent() {
            super();
        }

        // Getters and setters for all properties
        public CodeableConcept getFocus() {
            if (this.focus == null) {
                this.focus = new CodeableConcept(); // Lazy initialization
            }
            return this.focus;
        }

        public MolecularDefinitionRepresentationComponent setFocus(CodeableConcept value) {
            this.focus = value;
            return this;
        }

        public boolean hasFocus() {
            return this.focus != null && !this.focus.isEmpty();
        }

        public List<CodeableConcept> getCode() {
            if (this.code == null) {
                this.code = new ArrayList<>();
            }
            return this.code;
        }

        public MolecularDefinitionRepresentationComponent setCode(List<CodeableConcept> value) {
            this.code = value;
            return this;
        }

        public boolean hasCode() {
            return this.code != null && !this.code.isEmpty();
        }

        public CodeableConcept addCode() {
            CodeableConcept t = new CodeableConcept();
            if (this.code == null)
                this.code = new ArrayList<CodeableConcept>();
            this.code.add(t);
            return t;
        }

        public MolecularDefinitionRepresentationComponent addCode(CodeableConcept t) { //3
            if (t == null)
                return this;
            if (this.code == null)
                this.code = new ArrayList<CodeableConcept>();
            this.code.add(t);
            return this;
        }

        public MolecularDefinitionRepresentationLiteralComponent getLiteral() {
            if (this.literal == null) {
                this.literal = new MolecularDefinitionRepresentationLiteralComponent();
            }
            return this.literal;
        }

        public MolecularDefinitionRepresentationComponent setLiteral(MolecularDefinitionRepresentationLiteralComponent value) {
            this.literal = value;
            return this;
        }

        public boolean hasLiteral() {
            return this.literal != null && !this.literal.isEmpty();
        }

        public Reference getResolvable() {
            if (this.resolvable == null) {
                this.resolvable = new Reference();
            }
            return this.resolvable;
        }

        public MolecularDefinitionRepresentationComponent setResolvable(Reference value) {
            this.resolvable = value;
            return this;
        }

        public boolean hasResolvable() {
            return this.resolvable != null && !this.resolvable.isEmpty();
        }

        public MolecularDefinitionRepresentationExtractedComponent getExtracted() {
            if (this.extracted == null) {
                this.extracted = new MolecularDefinitionRepresentationExtractedComponent();
            }
            return this.extracted;
        }

        public MolecularDefinitionRepresentationComponent setExtracted(MolecularDefinitionRepresentationExtractedComponent value) {
            this.extracted = value;
            return this;
        }

        public boolean hasExtracted() {
            return this.extracted != null && !this.extracted.isEmpty();
        }

        public MolecularDefinitionRepresentationRepeatedComponent getRepeated() {
            if (this.repeated == null) {
                this.repeated = new MolecularDefinitionRepresentationRepeatedComponent();
            }
            return this.repeated;
        }

        public MolecularDefinitionRepresentationComponent setRepeated(MolecularDefinitionRepresentationRepeatedComponent value) {
            this.repeated = value;
            return this;
        }

        public boolean hasRepeated() {
            return this.repeated != null && !this.repeated.isEmpty();
        }

        public MolecularDefinitionRepresentationConcatenatedComponent getConcatenated() {
            if (this.concatenated == null) {
                this.concatenated = new MolecularDefinitionRepresentationConcatenatedComponent();
            }
            return this.concatenated;
        }

        public MolecularDefinitionRepresentationComponent setConcatenated(MolecularDefinitionRepresentationConcatenatedComponent value) {
            this.concatenated = value;
            return this;
        }

        public boolean hasConcatenated() {
            return this.concatenated != null && !this.concatenated.isEmpty();
        }

        public MolecularDefinitionRepresentationRelativeComponent getRelative() {
            if (this.relative == null) {
                this.relative = new MolecularDefinitionRepresentationRelativeComponent();
            }
            return this.relative;
        }

        public MolecularDefinitionRepresentationComponent setRelative(MolecularDefinitionRepresentationRelativeComponent value) {
            this.relative = value;
            return this;
        }

        public boolean hasRelative() {
            return this.relative != null && !this.relative.isEmpty();
        }

        @Override
        protected void listChildren(List<Property> children) {
            super.listChildren(children);
            children.add(new Property("focus", "CodeableConcept", "The domain concept that is the focus of the representation.", 0, 1, focus));
            children.add(new Property("code", "CodeableConcept", "A code (e.g., sequence accession number).", 0, Child.MAX_UNLIMITED, code));
            children.add(new Property("literal", "MolecularDefinitionRepresentationLiteralComponent", "A molecular entity defined as a literal.", 0, 1, literal));
            children.add(new Property("resolvable", "Reference", "A resolvable molecular entity.", 0, 1, resolvable));
            children.add(new Property("extracted", "MolecularDefinitionRepresentationExtractedComponent", "A portion of a parent molecular entity.", 0, 1, extracted));
            children.add(new Property("repeated", "MolecularDefinitionRepresentationRepeatedComponent", "A repeated motif molecular entity.", 0, 1, repeated));
            children.add(new Property("concatenated", "MolecularDefinitionRepresentationConcatenatedComponent", "A concatenated molecular entity.", 0, 1, concatenated));
            children.add(new Property("relative", "MolecularDefinitionRepresentationRelativeComponent", "Edits on a starting molecule.", 0, 1, relative));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
            switch (_hash) {
                case 97604824: // focus
                    return new Property("focus", "CodeableConcept", "The domain concept that is the focus of the representation.", 0, 1, focus);
                case 3059181: // code
                    return new Property("code", "CodeableConcept", "A code (e.g., sequence accession number).", 0, Child.MAX_UNLIMITED, code);
                case 182460591: // literal
                    return new Property("literal", "MolecularDefinitionRepresentationLiteralComponent", "A molecular entity defined as a literal.", 0, 1, literal);
                case -1599679885: // resolvable
                    return new Property("resolvable", "Reference", "A resolvable molecular entity.", 0, 1, resolvable);
                case -252850976: // extracted
                    return new Property("extracted", "MolecularDefinitionRepresentationExtractedComponent", "A portion of a parent molecular entity.", 0, 1, extracted);
                case -436781190: // repeated
                    return new Property("repeated", "MolecularDefinitionRepresentationRepeatedComponent", "A repeated motif molecular entity.", 0, 1, repeated);
                case -568573873: // concatenated
                    return new Property("concatenated", "MolecularDefinitionRepresentationConcatenatedComponent", "A concatenated molecular entity.", 0, 1, concatenated);
                case -554435892: // relative
                    return new Property("relative", "MolecularDefinitionRepresentationRelativeComponent", "Edits on a starting molecule.", 0, 1, relative);
                default:
                    return super.getNamedProperty(_hash, _name, _checkValid);
            }
        }

        @Override
        public Base makeProperty(int hash, String name) throws FHIRException {
            switch (hash) {
                case 97604824: return getFocus();
                case 3059181: return addCode();
                case 182460591: return getLiteral();
                case -1599679885: return getResolvable();
                case -252850976: return getExtracted();
                case -436781190: return getRepeated();
                case -568573873: return getConcatenated();
                case -554435892: return getRelative();
                default: return super.makeProperty(hash, name);
            }
        }

        public MolecularDefinitionRepresentationComponent copy() {
            MolecularDefinitionRepresentationComponent dst = new MolecularDefinitionRepresentationComponent();
            copyValues(dst);
            return dst;
        }

        public void copyValues(MolecularDefinitionRepresentationComponent dst) {
            super.copyValues(dst);
            dst.focus = focus == null ? null : focus.copy(); // Copy `focus`
            if (code != null) { // Copy `code` list
                dst.code = new ArrayList<>();
                for (CodeableConcept c : code) {
                    dst.code.add(c.copy());
                }
            }
            dst.literal = literal == null ? null : literal.copy(); // Copy `literal`
            dst.resolvable = resolvable == null ? null : resolvable.copy(); // Copy `resolvable`
            dst.extracted = extracted == null ? null : extracted.copy(); // Copy `extracted`
            dst.repeated = repeated == null ? null : repeated.copy(); // Copy `repeated`
            dst.concatenated = concatenated == null ? null : concatenated.copy(); // Copy `concatenated`
            dst.relative = relative == null ? null : relative.copy(); // Copy `relative`
        }

        @Override
        public boolean equalsDeep(Base other_) {
            if (!super.equalsDeep(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionRepresentationComponent))
                return false;
            MolecularDefinitionRepresentationComponent o = (MolecularDefinitionRepresentationComponent) other_;
            return compareDeep(focus, o.focus, true)
                    && compareDeep(code, o.code, true)
                    && compareDeep(literal, o.literal, true)
                    && compareDeep(resolvable, o.resolvable, true)
                    && compareDeep(extracted, o.extracted, true)
                    && compareDeep(repeated, o.repeated, true)
                    && compareDeep(concatenated, o.concatenated, true)
                    && compareDeep(relative, o.relative, true);
        }

        @Override
        public boolean equalsShallow(Base other_) {
            if (!super.equalsShallow(other_))
                return false;
            if (!(other_ instanceof MolecularDefinitionRepresentationComponent))
                return false;
            return true; // Always true for `shallow` in this implementation
        }

        @Override
        public boolean isEmpty() {
            return super.isEmpty()
                    && (focus == null || focus.isEmpty())
                    && (code == null || code.isEmpty())
                    && (literal == null || literal.isEmpty())
                    && (resolvable == null || resolvable.isEmpty())
                    && (extracted == null || extracted.isEmpty())
                    && (repeated == null || repeated.isEmpty())
                    && (concatenated == null || concatenated.isEmpty())
                    && (relative == null || relative.isEmpty());
        }

        @Override
        public String fhirType() {
            return "MolecularDefinitionRepresentationComponent";
        }
    }

    /**
     * Unique ID of an instance.
     */
    @Child(name = "identifier", type = {Identifier.class}, order = 0, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
    @Description(shortDefinition = "An identifier for this patient", formalDefinition = "An identifier for this patient.")
    protected List<Identifier> identifier;

    /**
     * Description of the Molecular Definition instance
     */
    @Child(name = "description", type = {MarkdownType.class}, order = 1, min = 0, max = 1, modifier = false, summary = false)
    @Description(shortDefinition = "Description of the Molecular Definition instance", formalDefinition = "A description of the molecular entity in a human friendly format.")
    protected MarkdownType description;

    /**
     * The type of molecule (e.g., DNA, RNA, amino acid)
     */
    @Child(name = "moleculeType", type = {CodeableConcept.class}, order = 2, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "The type of molecule (e.g., DNA, RNA, amino acid)", formalDefinition = "The type of molecule (e.g., DNA, RNA, amino acid). This is a broad concept that refers to the general physical composition of the molecule, intended to facilitate searching and to provide domain context for profiles and instances. The terminology binding may be expanded to support additional types of molecules in the future (e.g., peptide nucleic acids, oligosaccharides).")
    protected CodeableConcept moleculeType;

    /**
     * Classification of the molecule into types other than those defined by moleculeType
     */
    @Child(name = "type", type = {CodeableConcept.class}, order = 3, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
    @Description(shortDefinition = "Classification of the molecule into types other than those defined by moleculeType", formalDefinition = "Classifications of an instance of the resource into arbitrary types, based on domain semantics. For example, this element could indicate that an instance of moleculeType 'RNA' could have a type of 'mRNA' or 'siRNA'.")
    protected List<CodeableConcept> type;

    /**
     * The structural topology of the molecular entity (e.g., linear, circular)
     */
    @Child(name = "topology", type = {CodeableConcept.class}, order = 4, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
    @Description(shortDefinition = "The structural topology of the molecular entity (e.g., linear, circular)", formalDefinition = "The structural topology of the molecular entity. For sequences (e.g., DNA), this could specify 'linear' and 'circular'. More complex entities might be branched or have a quaternary structure.")
    protected List<CodeableConcept> topology;

    /**
     * Constituents of an aggregate molecular concept (e.g., haplotype, genotype)
     */
    @Child(name = "member", type = {Reference.class}, order = 5, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
    @Description(shortDefinition = "Constituents of an aggregate molecular concept (e.g., haplotype, genotype)", formalDefinition = "Constituents of an aggregate molecular concept (e.g., haplotype, genotype).")
    protected List<Reference> member;

    /**
     * A defined location on a molecular entity
     */
    @Child(name = "location", type = {MolecularDefinitionLocationComponent.class}, order = 6, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
    @Description(shortDefinition = "A defined location on a molecular entity", formalDefinition = "A defined location on a molecular entity. Location definitions may vary with respect to coordinate space and precision or level of granularity.")
    protected List<MolecularDefinitionLocationComponent> location;

    /**
     * A representation of a molecular entity
     */
    @Child(name = "representation", type = {MolecularDefinitionRepresentationComponent.class}, order = 7, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
    @Description(shortDefinition = "A coordinate-based location on a sequence", formalDefinition = "A location on a sequence, defined using a nucleotide coordinate system.")
    protected List<MolecularDefinitionRepresentationComponent> representation;

    private static final long serialVersionUID = 137345347491L;

    /**
     * Constructor
     */
    public MolecularDefinition() {
        super();
    }

    /**
     * @return {@link #identifier} (An identifier for this patient.)
     */
    public List<Identifier> getIdentifier() {
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public MolecularDefinition setIdentifier(List<Identifier> theIdentifier) {
        this.identifier = theIdentifier;
        return this;
    }

    public boolean hasIdentifier() {
        if (this.identifier == null)
            return false;
        for (Identifier item : this.identifier)
            if (!item.isEmpty())
                return true;
        return false;
    }

    public Identifier addIdentifier() { //3
        Identifier t = new Identifier();
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return t;
    }

    public MolecularDefinition addIdentifier(Identifier t) { //3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return The first repetition of repeating field {@link #identifier}, creating it if it does not already exist {3}
     */
    public Identifier getIdentifierFirstRep() {
        if (getIdentifier().isEmpty()) {
            addIdentifier();
        }
        return getIdentifier().get(0);
    }

    /**
     * @return {@link #description} (Description of the Molecular Definition instance.)
     */
    public MarkdownType getDescription() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MolecularDefinition.description");
            else if (Configuration.doAutoCreate())
                this.description = new MarkdownType(); // bb
        return this.description;
    }

    public boolean hasDescription() {
        return this.description != null && !this.description.isEmpty();
    }

    /**
     * @param value {@link #description} (Description of the Molecular Definition instance.)
     */
    public MolecularDefinition setDescription(MarkdownType value) {
        this.description = value;
        return this;
    }

    /**
     * @return {@link #moleculeType} (The type of molecule (e.g., DNA, RNA, amino acid))
     */
    public CodeableConcept getMoleculeType() {
        if (this.moleculeType == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create MolecularDefinition.moleculeType");
            else if (Configuration.doAutoCreate())
                this.moleculeType = new CodeableConcept(); // cc
        return this.moleculeType;
    }

    public boolean hasMoleculeType() {
        return this.moleculeType != null && !this.moleculeType.isEmpty();
    }

    /**
     * @param value {@link #moleculeType} (The type of molecule (e.g., DNA, RNA, amino acid))
     */
    public MolecularDefinition setMoleculeType(CodeableConcept value) {
        this.moleculeType = value;
        return this;
    }

    /**
     * @return {@link #type} (Classification of the molecule into types other than those defined by moleculeType)
     */
    public List<CodeableConcept> getType() {
        if (this.type == null)
            this.type = new ArrayList<CodeableConcept>();
        return this.type;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public MolecularDefinition setType(List<CodeableConcept> theType) {
        this.type = theType;
        return this;
    }

    public boolean hasType() {
        if (this.type == null)
            return false;
        for (CodeableConcept item : this.type)
            if (!item.isEmpty())
                return true;
        return false;
    }

    public CodeableConcept addType() { //3
        CodeableConcept t = new CodeableConcept();
        if (this.type == null)
            this.type = new ArrayList<CodeableConcept>();
        this.type.add(t);
        return t;
    }

    public MolecularDefinition addType(CodeableConcept t) { //3
        if (t == null)
            return this;
        if (this.type == null)
            this.type = new ArrayList<CodeableConcept>();
        this.type.add(t);
        return this;
    }

    /**
     * @return The first repetition of repeating field {@link #type}, creating it if it does not already exist {3}
     */
    public CodeableConcept getTypeFirstRep() {
        if (getType().isEmpty()) {
            addType();
        }
        return getType().get(0);
    }

    /**
     * @return {@link #topology} (The structural topology of the molecular entity (e.g., linear, circular))
     */
    public List<CodeableConcept> getTopology() {
        if (this.topology == null)
            this.topology = new ArrayList<CodeableConcept>();
        return this.topology;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public MolecularDefinition setTopology(List<CodeableConcept> theTopology) {
        this.topology = theTopology;
        return this;
    }

    public boolean hasTopology() {
        if (this.topology == null)
            return false;
        for (CodeableConcept item : this.topology)
            if (!item.isEmpty())
                return true;
        return false;
    }

    public CodeableConcept addTopology() { //3
        CodeableConcept t = new CodeableConcept();
        if (this.topology == null)
            this.topology = new ArrayList<CodeableConcept>();
        this.topology.add(t);
        return t;
    }

    public MolecularDefinition addTopology(CodeableConcept t) { //3
        if (t == null)
            return this;
        if (this.topology == null)
            this.topology = new ArrayList<CodeableConcept>();
        this.topology.add(t);
        return this;
    }

    /**
     * @return The first repetition of repeating field {@link #topology}, creating it if it does not already exist {3}
     */
    public CodeableConcept getTopologyFirstRep() {
        if (getTopology().isEmpty()) {
            addTopology();
        }
        return getTopology().get(0);
    }

    /**
     * @return {@link #member} (Constituents of an aggregate molecular concept (e.g., haplotype, genotype).)
     */
    public List<Reference> getMember() {
        if (this.member == null)
            this.member = new ArrayList<Reference>();
        return this.member;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public MolecularDefinition setMember(List<Reference> theMember) {
        this.member = theMember;
        return this;
    }

    public boolean hasMember() {
        if (this.member == null)
            return false;
        for (Reference item : this.member)
            if (!item.isEmpty())
                return true;
        return false;
    }

    public Reference addMember() { //3
        Reference t = new Reference();
        if (this.member == null)
            this.member = new ArrayList<Reference>();
        this.member.add(t);
        return t;
    }

    public MolecularDefinition addMember(Reference t) { //3
        if (t == null)
            return this;
        if (this.member == null)
            this.member = new ArrayList<Reference>();
        this.member.add(t);
        return this;
    }

    /**
     * @return The first repetition of repeating field {@link #member}, creating it if it does not already exist {3}
     */
    public Reference getMemberFirstRep() {
        if (getMember().isEmpty()) {
            addMember();
        }
        return getMember().get(0);
    }

    /**
     * @return {@link #location} (A defined location on a molecular entity.)
     */
    public List<MolecularDefinitionLocationComponent> getLocation() {
        if (this.location == null)
            this.location = new ArrayList<MolecularDefinitionLocationComponent>();
        return this.location;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public MolecularDefinition setLocation(List<MolecularDefinitionLocationComponent> theLocation) {
        this.location = theLocation;
        return this;
    }

    public boolean hasLocation() {
        if (this.location == null)
            return false;
        for (MolecularDefinitionLocationComponent item : this.location)
            if (!item.isEmpty())
                return true;
        return false;
    }

    public MolecularDefinitionLocationComponent addLocation() { //3
        MolecularDefinitionLocationComponent t = new MolecularDefinitionLocationComponent();
        if (this.location == null)
            this.location = new ArrayList<MolecularDefinitionLocationComponent>();
        this.location.add(t);
        return t;
    }

    public MolecularDefinition addLocation(MolecularDefinitionLocationComponent t) { //3
        if (t == null)
            return this;
        if (this.location == null)
            this.location = new ArrayList<MolecularDefinitionLocationComponent>();
        this.location.add(t);
        return this;
    }

    /**
     * @return The first repetition of repeating field {@link #identifier}, creating it if it does not already exist {3}
     */
    public MolecularDefinitionLocationComponent getLocationFirstRep() {
        if (getLocation().isEmpty()) {
            addLocation();
        }
        return getLocation().get(0);
    }

    /**
     * @return {@link #location} (A defined location on a molecular entity.)
     */
    public List<MolecularDefinitionRepresentationComponent> getRepresentation() {
        if (this.representation == null)
            this.representation = new ArrayList<MolecularDefinitionRepresentationComponent>();
        return this.representation;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public MolecularDefinition setRepresentation(List<MolecularDefinitionRepresentationComponent> theLocation) {
        this.representation = theLocation;
        return this;
    }

    public boolean hasRepresentation() {
        if (this.representation == null)
            return false;
        for (MolecularDefinitionRepresentationComponent item : this.representation)
            if (!item.isEmpty())
                return true;
        return false;
    }

    public MolecularDefinitionRepresentationComponent addRepresentation() { //3
        MolecularDefinitionRepresentationComponent t = new MolecularDefinitionRepresentationComponent();
        if (this.representation == null)
            this.representation = new ArrayList<MolecularDefinitionRepresentationComponent>();
        this.representation.add(t);
        return t;
    }

    public MolecularDefinition addRepresentation(MolecularDefinitionRepresentationComponent t) { //3
        if (t == null)
            return this;
        if (this.representation == null)
            this.representation = new ArrayList<MolecularDefinitionRepresentationComponent>();
        this.representation.add(t);
        return this;
    }

    /**
     * @return The first repetition of repeating field {@link #identifier}, creating it if it does not already exist {3}
     */
    public MolecularDefinitionRepresentationComponent getRepresentationFirstRep() {
        if (getRepresentation().isEmpty()) {
            addRepresentation();
        }
        return getRepresentation().get(0);
    }


    protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("identifier", "Identifier", "Unique ID of an instance.", 0, java.lang.Integer.MAX_VALUE, identifier));
        children.add(new Property("description", "Markdown", "Description of the Molecular Definition instance.", 0, 1, description));
        children.add(new Property("moleculeType", "CodeableConcept", "The type of molecule (e.g., DNA, RNA, amino acid).", 0, 1, moleculeType));
        children.add(new Property("type", "CodeableConcept", "Classification of the molecule into types other than those defined by moleculeType.", 0, java.lang.Integer.MAX_VALUE, type));
        children.add(new Property("topology", "CodeableConcept", "The structural topology of the molecular entity (e.g., linear, circular).", 0, java.lang.Integer.MAX_VALUE, topology));
        children.add(new Property("member", "MolecularDefinition", "Constituents of an aggregate molecular concept (e.g., haplotype, genotype).", 0, java.lang.Integer.MAX_VALUE, member));
        children.add(new Property("location", "", "A defined location on a molecular entity.", 0, java.lang.Integer.MAX_VALUE, location));
        children.add(new Property("representation", "", "A representation of a molecular entity.", 0, java.lang.Integer.MAX_VALUE, representation));
    }

    @Override
    public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
            case -1618432855: /*identifier*/
                return new Property("identifier", "Identifier", "Unique ID of an instance.", 0, java.lang.Integer.MAX_VALUE, identifier);
            case -1724546052: /*description*/
                return new Property("description", "Markdown", "Description of the Molecular Definition instance.", 0, 1, description);
            case 2065205984: /*moleculeType*/
                return new Property("moleculeType", "CodeableConcept", "The type of molecule (e.g., DNA, RNA, amino acid).", 0, 1, moleculeType);
            case 3575610: /*type*/
                return new Property("type", "CodeableConcept", "Classification of the molecule into types other than those defined by moleculeType.", 0, java.lang.Integer.MAX_VALUE, type);
            case -951467409: /*topology*/
                return new Property("topology", "CodeableConcept", "The structural topology of the molecular entity (e.g., linear, circular).", 0, java.lang.Integer.MAX_VALUE, topology);
            case -1077769574: /*member*/
                return new Property("member", "MolecularDefinition", "Constituents of an aggregate molecular concept (e.g., haplotype, genotype).", 0, java.lang.Integer.MAX_VALUE, member);
            case 1901043637: /*location*/
                return new Property("location", "", "A defined location on a molecular entity.", 0, java.lang.Integer.MAX_VALUE, location);
            case -671065907: /*representation*/
                return new Property("representation", "", "A representation of a molecular entity.", 0, java.lang.Integer.MAX_VALUE, representation);

            default:
                return super.getNamedProperty(_hash, _name, _checkValid);
        }

    }

    @Override
    public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
            case -1618432855: /*identifier*/
                return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
            case -1724546052: /*description*/
                return this.description == null ? new Base[0] : new Base[]{this.description}; // Markdown
            case 2065205984: /*moleculeType*/
                return this.moleculeType == null ? new Base[0] : new Base[]{this.moleculeType}; // CodeableConcept
            case 3575610: /*type*/
                return this.type == null ? new Base[0] : this.type.toArray(new Base[this.type.size()]); // CodeableConcept
            case -951467409: /*topology*/
                return this.topology == null ? new Base[0] : this.topology.toArray(new Base[this.topology.size()]); // Identifier
            case -1077769574: /*member*/
                return this.member == null ? new Base[0] : this.member.toArray(new Base[this.member.size()]); // Identifier
            case 1901043637: /*location*/
                return this.location == null ? new Base[0] : this.location.toArray(new Base[this.location.size()]); // TBD
            case -671065907: /*representation*/
                return this.representation == null ? new Base[0] : this.representation.toArray(new Base[this.representation.size()]); // TBD
            default:
                return super.getProperty(hash, name, checkValid);
        }

    }

    @Override
    public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
            case -1618432855: // identifier
                this.getIdentifier().add(TypeConvertor.castToIdentifier(value)); // Identifier
                return value;
            case -1724546052: // description
                this.description = TypeConvertor.castToMarkdown(value); // Markdown
                return value;
            case 2065205984: // moleculeType
                this.moleculeType = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
                return value;
            case 3575610: // type
                this.getType().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
                return value;
            case -951467409: // topology
                this.getTopology().add(TypeConvertor.castToCodeableConcept(value)); // Topology
                return value;
            case -1077769574: // member
                this.getMember().add(TypeConvertor.castToReference(value)); // Reference
                return value;
            case 1901043637: // location
                this.getLocation().add((MolecularDefinitionLocationComponent) value); // MolecularDefinitionLocationComponent
                return value;
            case -671065907: // representation
                this.getRepresentation().add((MolecularDefinitionRepresentationComponent) value); // MolecularDefinitionRepresentationComponent
                return value;
            default:
                return super.setProperty(hash, name, value);
        }

    }

    @Override
    public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier")) {
            this.getIdentifier().add(TypeConvertor.castToIdentifier(value));
        } else if (name.equals("description")) {
            this.description = TypeConvertor.castToMarkdown(value); // BooleanType
        } else if (name.equals("moleculeType")) {
            this.moleculeType = TypeConvertor.castToCodeableConcept(value);
        } else if (name.equals("type")) {
            this.getType().add(TypeConvertor.castToCodeableConcept(value));
        } else if (name.equals("topology")) {
            this.getTopology().add(TypeConvertor.castToCodeableConcept(value));
        } else if (name.equals("member")) {
            this.getMember().add(TypeConvertor.castToReference(value));
        } else if (name.equals("location")) {
            this.getLocation().add((MolecularDefinitionLocationComponent) value);
        } else if (name.equals("representation")) {
            this.getRepresentation().add((MolecularDefinitionRepresentationComponent) value);
        } else
            return super.setProperty(name, value);
        return value;
    }

    @Override
    public void removeChild(String name, Base value) throws FHIRException {
        if (name.equals("identifier")) {
            this.getIdentifier().remove(TypeConvertor.castToIdentifier(value));
        } else if (name.equals("description")) {
            this.description = null;
        } else if (name.equals("moleculeType")) {
            this.moleculeType = null;
        } else if (name.equals("type")) {
            this.getType().remove(TypeConvertor.castToCodeableConcept(value));
        } else if (name.equals("topology")) {
            this.getTopology().remove(TypeConvertor.castToCodeableConcept(value));
        } else if (name.equals("member")) {
            this.getMember().remove(TypeConvertor.castToReference(value));
        } else if (name.equals("location")) {
            this.getLocation().remove((MolecularDefinitionLocationComponent) value);
        } else if (name.equals("representation")) {
            this.getRepresentation().remove((MolecularDefinitionRepresentationComponent) value);
        } else
            super.removeChild(name, value);

    }

    @Override
    public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
            case -1618432855:
                return addIdentifier();
            case -1724546052:
                return getDescription();
            case 2065205984:
                return getMoleculeType();
            case 3575610:
                return addType();
            case -951467409:
                return addTopology();
            case -1077769574:
                return addMember();
            case 1901043637:
                return addLocation();
            case -671065907:
                return addRepresentation();
            default:
                return super.makeProperty(hash, name);
        }

    }

    @Override
    public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
            case -1618432855: /*identifier*/
                return new String[]{"Identifier"};
            case -1724546052: /*description*/
                return new String[]{"Markdown"};
            case 2065205984: /*moleculeType*/
                return new String[]{"CodeableConcept"};
            case 3575610: /*type*/
                return new String[]{"CodeableConcept"};
            case -951467409: /*topology*/
                return new String[]{"CodeableConcept"};
            case -1077769574: /*member*/
                return new String[]{"Reference"};
            case 1901043637: /*location*/
                return new String[]{};
            case -671065907: /*representation*/
                return new String[]{};
            default:
                return super.getTypesForProperty(hash, name);
        }

    }

    @Override
    public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a singleton property MolecularDefinition.description");
        } else if (name.equals("moleculeType")) {
            throw new FHIRException("Cannot call addChild on a singleton property MolecularDefinition.moleculeType");
        } else if (name.equals("type")) {
            return addType();
        } else if (name.equals("topology")) {
            return addTopology();
        } else if (name.equals("location")) {
            return addLocation();
        } else if (name.equals("representation")) {
            return addRepresentation();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "MolecularDefinition";

    }

    public MolecularDefinition copy() {
        MolecularDefinition dst = new MolecularDefinition();
        copyValues(dst);
        return dst;
    }

    public void copyValues(MolecularDefinition dst) {
        super.copyValues(dst);
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier)
                dst.identifier.add(i.copy());
        }
        dst.description = description == null ? null : description.copy();
        dst.moleculeType = moleculeType == null ? null : moleculeType.copy();
        if (type != null) {
            dst.type = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : type)
                dst.type.add(i.copy());
        }
        if (topology != null) {
            dst.topology = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : topology)
                dst.topology.add(i.copy());
        }
        if (member != null) {
            dst.member = new ArrayList<Reference>();
            for (Reference i : member)
                dst.member.add(i.copy());
        }
        if (location != null) {
            dst.location = new ArrayList<MolecularDefinitionLocationComponent>();
            for (MolecularDefinitionLocationComponent i : location)
                dst.location.add(i.copy());
        }
        if (representation != null) {
            dst.representation = new ArrayList<MolecularDefinitionRepresentationComponent>();
            for (MolecularDefinitionRepresentationComponent i : representation)
                dst.representation.add(i.copy());
        }
    }

    protected MolecularDefinition typedCopy() {
        return copy();
    }

    @Override
    public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
            return false;
        if (!(other_ instanceof MolecularDefinition))
            return false;
        MolecularDefinition o = (MolecularDefinition) other_;
        return compareDeep(identifier, o.identifier, true) && compareDeep(description, o.description, true) && compareDeep(moleculeType, o.moleculeType, true)
                && compareDeep(type, o.type, true)
                && compareDeep(topology, o.topology, true)
                && compareDeep(member, o.member, true)
                && compareDeep(location, o.location, true)
                && compareDeep(representation, o.representation, true)
                ;
    }

    @Override
    public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
            return false;
        if (!(other_ instanceof MolecularDefinition))
            return false;
        MolecularDefinition o = (MolecularDefinition) other_;
        return equalsDeep(other_)
                ;
    }

    public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, description, moleculeType, type, topology, member, location, representation);
    }

    @Override
    public ResourceType getResourceType() {
        throw new RuntimeException("MolecularDefinition is a hand-made resource and has no enumerated type yet.");//Not sure how to handle extended resources
    }

}