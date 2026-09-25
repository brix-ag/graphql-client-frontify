package ch.brix.gql.client.frontify.builders;

public class CatalogLinkCell_links extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.CatalogLinkCellValue>> {
  public CatalogLinkCell_links() {
    super(new ch.brix.gql.client.Call<>("links", "CatalogLinkCellValue"));
  }
  public CatalogLinkCell_links onCatalogLinkCellValue(On_CatalogLinkCellValue typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
