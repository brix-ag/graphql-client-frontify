package ch.brix.gql.client.frontify.builders;

public class CustomMetadataCatalogLinkValue_cells extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.CustomMetadataCatalogCell>> {
  public CustomMetadataCatalogLinkValue_cells() {
    super(new ch.brix.gql.client.Call<>("cells", "CustomMetadataCatalogCell"));
  }
  public CustomMetadataCatalogLinkValue_cells onCustomMetadataCatalogLinkCell(On_CustomMetadataCatalogLinkCell typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CustomMetadataCatalogLinkValue_cells onCustomMetadataCatalogTextCell(On_CustomMetadataCatalogTextCell typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CustomMetadataCatalogLinkValue_cells onCustomMetadataCatalogCell(On_CustomMetadataCatalogCell typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
