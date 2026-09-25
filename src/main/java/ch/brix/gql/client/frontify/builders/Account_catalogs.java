package ch.brix.gql.client.frontify.builders;

public class Account_catalogs extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CatalogItems> {
  public Account_catalogs() {
    super(new ch.brix.gql.client.Call<>("catalogs", "CatalogItems"));
  }
  public Account_catalogs args(Account_catalogs_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Account_catalogs onCatalogItems(On_CatalogItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
