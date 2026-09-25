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
   * `CustomMetadataProperty` value. For `SELECT`, returns an object with `optionId` and `text`. For `CATALOG`, returns an opaque catalog selection ID string. For other single-value property types, returns the stored value as `String`/`Float`/`Int`/`DateTime`.
   */
  public On_CustomMetadataValue value() {
    _add_field("value");
    return this;
  }
}
