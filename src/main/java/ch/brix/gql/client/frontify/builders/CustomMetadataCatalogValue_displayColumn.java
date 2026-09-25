package ch.brix.gql.client.frontify.builders;

public class CustomMetadataCatalogValue_displayColumn extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.CustomMetadataCatalogColumn> {
  public CustomMetadataCatalogValue_displayColumn() {
    super(new ch.brix.gql.client.Call<>("displayColumn", "CustomMetadataCatalogColumn"));
  }
  public CustomMetadataCatalogValue_displayColumn onCustomMetadataCatalogLinkColumn(On_CustomMetadataCatalogLinkColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CustomMetadataCatalogValue_displayColumn onCustomMetadataCatalogTextColumn(On_CustomMetadataCatalogTextColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CustomMetadataCatalogValue_displayColumn onCustomMetadataCatalogColumn(On_CustomMetadataCatalogColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
