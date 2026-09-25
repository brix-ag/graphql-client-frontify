package ch.brix.gql.client.frontify.builders;

public class RootMutation_updateCatalog extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.UpdateCatalog> {
  public RootMutation_updateCatalog() {
    super(new ch.brix.gql.client.Call<>("updateCatalog", "UpdateCatalog"));
  }
  public RootMutation_updateCatalog args(RootMutation_updateCatalog_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_updateCatalog onUpdateCatalog(On_UpdateCatalog typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
