package ch.brix.gql.client.frontify.input_objects;

/**
 * The value to store for one custom metadata property. Provide exactly one arm, matching the property's type.
 */
public class CustomMetadataValueInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** Value for a `TEXT`, `LONGTEXT` or `URL` property.
   */
  public CustomMetadataValueInput text(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("text", v);
    return this;
  }
  /**
   * **BETA** Value for a `NUMBER` property.
   */
  public CustomMetadataValueInput number(ch.brix.gql.client.frontify.scalars.FloatScalar v) {
    values.put("number", v);
    return this;
  }
  /**
   * **BETA** Value for a `DATE` property.
   */
  public CustomMetadataValueInput date(ch.brix.gql.client.frontify.scalars.DateTimeScalar v) {
    values.put("date", v);
    return this;
  }
  /**
   * **BETA** `CustomMetadataPropertyOption` ids for a `SELECT` or `MULTISELECT` property.
   */
  public CustomMetadataValueInput optionIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("optionIds", v);
    return this;
  }
}
