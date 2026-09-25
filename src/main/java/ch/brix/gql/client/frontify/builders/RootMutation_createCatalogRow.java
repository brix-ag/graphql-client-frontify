package ch.brix.gql.client.frontify.builders;

public class RootMutation_createCatalogRow extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreateCatalogRow> {
  public RootMutation_createCatalogRow() {
    super(new ch.brix.gql.client.Call<>("createCatalogRow", "CreateCatalogRow"));
  }
  public RootMutation_createCatalogRow args(RootMutation_createCatalogRow_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_createCatalogRow onCreateCatalogRow(On_CreateCatalogRow typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
