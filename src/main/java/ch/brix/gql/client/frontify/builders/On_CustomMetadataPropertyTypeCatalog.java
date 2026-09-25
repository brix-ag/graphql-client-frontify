package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataPropertyTypeCatalog extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataPropertyTypeCatalog() {
    super(new ch.brix.gql.client.On("CustomMetadataPropertyTypeCatalog"));
  }
  /**
   * The `CustomMetadataProperty` type name.
   */
  public On_CustomMetadataPropertyTypeCatalog name() {
    _add_field("name");
    return this;
  }
  /**
   * **BETA** The `Catalog` linked to this `CustomMetadataProperty`.
   */
  public On_CustomMetadataPropertyTypeCatalog catalog(CustomMetadataPropertyTypeCatalog_catalog callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** The `CatalogColumn` used for display values.
   */
  public On_CustomMetadataPropertyTypeCatalog displayColumn(CustomMetadataPropertyTypeCatalog_displayColumn callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Whether multiple catalog rows can be selected for this property.
   */
  public On_CustomMetadataPropertyTypeCatalog allowMultiSelect() {
    _add_field("allowMultiSelect");
    return this;
  }
  /**
   * **BETA** Link column IDs the user may traverse via link expansion.
   */
  public On_CustomMetadataPropertyTypeCatalog allowedLinkedColumnIds() {
    _add_field("allowedLinkedColumnIds");
    return this;
  }
}
