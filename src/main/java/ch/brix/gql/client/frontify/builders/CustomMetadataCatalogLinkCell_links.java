package ch.brix.gql.client.frontify.builders;

public class CustomMetadataCatalogLinkCell_links extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.CustomMetadataCatalogLinkValue>> {
  public CustomMetadataCatalogLinkCell_links() {
    super(new ch.brix.gql.client.Call<>("links", "CustomMetadataCatalogLinkValue"));
  }
  public CustomMetadataCatalogLinkCell_links onCustomMetadataCatalogLinkValue(On_CustomMetadataCatalogLinkValue typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
