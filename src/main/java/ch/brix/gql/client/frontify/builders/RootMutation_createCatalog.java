package ch.brix.gql.client.frontify.builders;

public class RootMutation_createCatalog extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreateCatalog> {
  public RootMutation_createCatalog() {
    super(new ch.brix.gql.client.Call<>("createCatalog", "CreateCatalog"));
  }
  public RootMutation_createCatalog args(RootMutation_createCatalog_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_createCatalog onCreateCatalog(On_CreateCatalog typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
