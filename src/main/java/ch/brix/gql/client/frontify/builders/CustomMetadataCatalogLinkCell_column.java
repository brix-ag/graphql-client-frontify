package ch.brix.gql.client.frontify.builders;

public class CustomMetadataCatalogLinkCell_column extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.CustomMetadataCatalogColumn> {
  public CustomMetadataCatalogLinkCell_column() {
    super(new ch.brix.gql.client.Call<>("column", "CustomMetadataCatalogColumn"));
  }
  public CustomMetadataCatalogLinkCell_column onCustomMetadataCatalogLinkColumn(On_CustomMetadataCatalogLinkColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CustomMetadataCatalogLinkCell_column onCustomMetadataCatalogTextColumn(On_CustomMetadataCatalogTextColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CustomMetadataCatalogLinkCell_column onCustomMetadataCatalogColumn(On_CustomMetadataCatalogColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
