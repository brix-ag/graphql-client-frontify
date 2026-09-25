package ch.brix.gql.client.frontify.builders;

public class CatalogWindow_columns extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CatalogColumnItems> {
  public CatalogWindow_columns() {
    super(new ch.brix.gql.client.Call<>("columns", "CatalogColumnItems"));
  }
  public CatalogWindow_columns onCatalogColumnItems(On_CatalogColumnItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
