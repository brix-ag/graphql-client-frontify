package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataValues extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataValues() {
    super(new ch.brix.gql.client.On("CustomMetadataValues"));
  }
  /**
   * `CustomMetadataProperty` details.
   */
  public On_CustomMetadataValues property(CustomMetadataValues_property callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `CustomMetadataProperty` values. Returns an empty list or a list of objects with `optionId` and `text` property values (for `MULTISELECT` type only).
   */
  public On_CustomMetadataValues values() {
    _add_field("values");
    return this;
  }
}
