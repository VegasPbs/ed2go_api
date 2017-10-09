//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.09 at 03:49:51 PM PDT 
//


package https.api_ed2go;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CourseIncludeField.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CourseIncludeField"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CategoryIDs"/&gt;
 *     &lt;enumeration value="Demo"/&gt;
 *     &lt;enumeration value="Details"/&gt;
 *     &lt;enumeration value="DiscontinueDate"/&gt;
 *     &lt;enumeration value="Duration"/&gt;
 *     &lt;enumeration value="FAQs"/&gt;
 *     &lt;enumeration value="Hours"/&gt;
 *     &lt;enumeration value="Image"/&gt;
 *     &lt;enumeration value="Instructor"/&gt;
 *     &lt;enumeration value="Index"/&gt;
 *     &lt;enumeration value="LastModifiedDate"/&gt;
 *     &lt;enumeration value="Objectives"/&gt;
 *     &lt;enumeration value="Outline"/&gt;
 *     &lt;enumeration value="Overview"/&gt;
 *     &lt;enumeration value="Prerequisites"/&gt;
 *     &lt;enumeration value="RelatedCourses"/&gt;
 *     &lt;enumeration value="ReleaseDate"/&gt;
 *     &lt;enumeration value="Requirements"/&gt;
 *     &lt;enumeration value="StartDates"/&gt;
 *     &lt;enumeration value="StudentReviews"/&gt;
 *     &lt;enumeration value="Summary"/&gt;
 *     &lt;enumeration value="Title"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CourseIncludeField")
@XmlEnum
public enum CourseIncludeField {

    @XmlEnumValue("CategoryIDs")
    CATEGORY_I_DS("CategoryIDs"),
    @XmlEnumValue("Demo")
    DEMO("Demo"),
    @XmlEnumValue("Details")
    DETAILS("Details"),
    @XmlEnumValue("DiscontinueDate")
    DISCONTINUE_DATE("DiscontinueDate"),
    @XmlEnumValue("Duration")
    DURATION("Duration"),
    @XmlEnumValue("FAQs")
    FA_QS("FAQs"),
    @XmlEnumValue("Hours")
    HOURS("Hours"),
    @XmlEnumValue("Image")
    IMAGE("Image"),
    @XmlEnumValue("Instructor")
    INSTRUCTOR("Instructor"),
    @XmlEnumValue("Index")
    INDEX("Index"),
    @XmlEnumValue("LastModifiedDate")
    LAST_MODIFIED_DATE("LastModifiedDate"),
    @XmlEnumValue("Objectives")
    OBJECTIVES("Objectives"),
    @XmlEnumValue("Outline")
    OUTLINE("Outline"),
    @XmlEnumValue("Overview")
    OVERVIEW("Overview"),
    @XmlEnumValue("Prerequisites")
    PREREQUISITES("Prerequisites"),
    @XmlEnumValue("RelatedCourses")
    RELATED_COURSES("RelatedCourses"),
    @XmlEnumValue("ReleaseDate")
    RELEASE_DATE("ReleaseDate"),
    @XmlEnumValue("Requirements")
    REQUIREMENTS("Requirements"),
    @XmlEnumValue("StartDates")
    START_DATES("StartDates"),
    @XmlEnumValue("StudentReviews")
    STUDENT_REVIEWS("StudentReviews"),
    @XmlEnumValue("Summary")
    SUMMARY("Summary"),
    @XmlEnumValue("Title")
    TITLE("Title");
    private final String value;

    CourseIncludeField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CourseIncludeField fromValue(String v) {
        for (CourseIncludeField c: CourseIncludeField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
