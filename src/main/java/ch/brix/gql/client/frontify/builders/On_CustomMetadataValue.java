package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataValue extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataValue() {
    super(new ch.brix.gql.client.On("CustomMetadataValue"));
  }
  /**
   * `CustomMetadataProperty` details.
   */
  public On_CustomMetadataValue property(CustomMetadataValue_property callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `CustomMetadataProperty` value. Returns an object with `optionId` and `text` property values (for `SELECT` type only) or a string for other `CustomMetadataProperty` single value items.
   */
  public On_CustomMetadataValue value() {
    _add_field("value");
    return this;
  }
}
