package ch.brix.gql.client.frontify.builders;

public class CustomMetadataCatalogEntry_cells extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.CustomMetadataCatalogCell>> {
  public CustomMetadataCatalogEntry_cells() {
    super(new ch.brix.gql.client.Call<>("cells", "CustomMetadataCatalogCell"));
  }
  public CustomMetadataCatalogEntry_cells onCustomMetadataCatalogLinkCell(On_CustomMetadataCatalogLinkCell typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CustomMetadataCatalogEntry_cells onCustomMetadataCatalogTextCell(On_CustomMetadataCatalogTextCell typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CustomMetadataCatalogEntry_cells onCustomMetadataCatalogCell(On_CustomMetadataCatalogCell typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
