package ch.brix.gql.client.frontify.builders;

public class Catalog_window extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CatalogWindow> {
  public Catalog_window() {
    super(new ch.brix.gql.client.Call<>("window", "CatalogWindow"));
  }
  public Catalog_window args(Catalog_window_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Catalog_window onCatalogWindow(On_CatalogWindow typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
