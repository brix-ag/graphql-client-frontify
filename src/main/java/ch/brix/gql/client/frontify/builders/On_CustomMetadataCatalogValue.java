package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataCatalogValue extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataCatalogValue() {
    super(new ch.brix.gql.client.On("CustomMetadataCatalogValue"));
  }
  /**
   * **BETA** `CustomMetadataProperty` details.
   */
  public On_CustomMetadataCatalogValue property(CustomMetadataCatalogValue_property callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Catalog display column readable through custom metadata visibility.
   */
  public On_CustomMetadataCatalogValue displayColumn(CustomMetadataCatalogValue_displayColumn callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Catalog columns readable for displaying this custom metadata catalog value.
   */
  public On_CustomMetadataCatalogValue columns(CustomMetadataCatalogValue_columns callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Selected catalog entries readable for displaying this custom metadata catalog value.
   */
  public On_CustomMetadataCatalogValue entries(CustomMetadataCatalogValue_entries callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
