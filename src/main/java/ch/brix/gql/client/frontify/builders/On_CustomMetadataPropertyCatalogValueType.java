package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataPropertyCatalogValueType extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataPropertyCatalogValueType() {
    super(new ch.brix.gql.client.On("CustomMetadataPropertyCatalogValueType"));
  }
  /**
   * **BETA** `CustomMetadataPropertyValueType` property type.
   */
  public On_CustomMetadataPropertyCatalogValueType propertyType() {
    _add_field("propertyType");
    return this;
  }
}
