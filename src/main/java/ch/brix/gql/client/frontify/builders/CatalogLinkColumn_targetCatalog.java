package ch.brix.gql.client.frontify.builders;

public class CatalogLinkColumn_targetCatalog extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.Catalog> {
  public CatalogLinkColumn_targetCatalog() {
    super(new ch.brix.gql.client.Call<>("targetCatalog", "Catalog"));
  }
  public CatalogLinkColumn_targetCatalog onCatalog(On_Catalog typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
