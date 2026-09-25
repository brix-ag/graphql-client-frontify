package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataPropertyPermissions extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataPropertyPermissions() {
    super(new ch.brix.gql.client.On("CustomMetadataPropertyPermissions"));
  }
  /**
   * **BETA** List of basic permissions defined for the custom metadata property.
   */
  public On_CustomMetadataPropertyPermissions basic(CustomMetadataPropertyPermissions_basic callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** List of custom permissions defined for the custom metadata property.
   */
  public On_CustomMetadataPropertyPermissions custom(CustomMetadataPropertyPermissions_custom callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
