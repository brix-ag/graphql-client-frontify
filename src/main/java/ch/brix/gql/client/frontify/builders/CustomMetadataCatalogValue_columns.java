package ch.brix.gql.client.frontify.builders;

public class CustomMetadataCatalogValue_columns extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.CustomMetadataCatalogColumn>> {
  public CustomMetadataCatalogValue_columns() {
    super(new ch.brix.gql.client.Call<>("columns", "CustomMetadataCatalogColumn"));
  }
  public CustomMetadataCatalogValue_columns onCustomMetadataCatalogLinkColumn(On_CustomMetadataCatalogLinkColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CustomMetadataCatalogValue_columns onCustomMetadataCatalogTextColumn(On_CustomMetadataCatalogTextColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CustomMetadataCatalogValue_columns onCustomMetadataCatalogColumn(On_CustomMetadataCatalogColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
