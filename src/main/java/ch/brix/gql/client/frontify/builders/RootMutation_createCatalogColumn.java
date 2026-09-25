package ch.brix.gql.client.frontify.builders;

public class RootMutation_createCatalogColumn extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreateCatalogColumn> {
  public RootMutation_createCatalogColumn() {
    super(new ch.brix.gql.client.Call<>("createCatalogColumn", "CreateCatalogColumn"));
  }
  public RootMutation_createCatalogColumn args(RootMutation_createCatalogColumn_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_createCatalogColumn onCreateCatalogColumn(On_CreateCatalogColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
