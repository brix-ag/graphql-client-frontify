package ch.brix.gql.client.frontify.builders;

public class CatalogLinkCell_row extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CatalogRow> {
  public CatalogLinkCell_row() {
    super(new ch.brix.gql.client.Call<>("row", "CatalogRow"));
  }
  public CatalogLinkCell_row onCatalogRow(On_CatalogRow typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
