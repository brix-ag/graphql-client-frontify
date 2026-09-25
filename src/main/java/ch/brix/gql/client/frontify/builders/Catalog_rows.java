package ch.brix.gql.client.frontify.builders;

public class Catalog_rows extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CatalogRowItems> {
  public Catalog_rows() {
    super(new ch.brix.gql.client.Call<>("rows", "CatalogRowItems"));
  }
  public Catalog_rows args(Catalog_rows_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Catalog_rows onCatalogRowItems(On_CatalogRowItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
