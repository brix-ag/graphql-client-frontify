package ch.brix.gql.client.frontify.builders;

public class Catalog_columns extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CatalogColumnItems> {
  public Catalog_columns() {
    super(new ch.brix.gql.client.Call<>("columns", "CatalogColumnItems"));
  }
  public Catalog_columns args(Catalog_columns_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Catalog_columns onCatalogColumnItems(On_CatalogColumnItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
