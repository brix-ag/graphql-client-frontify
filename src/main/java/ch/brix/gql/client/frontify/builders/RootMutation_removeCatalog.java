package ch.brix.gql.client.frontify.builders;

public class RootMutation_removeCatalog extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.RemoveCatalog> {
  public RootMutation_removeCatalog() {
    super(new ch.brix.gql.client.Call<>("removeCatalog", "RemoveCatalog"));
  }
  public RootMutation_removeCatalog args(RootMutation_removeCatalog_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_removeCatalog onRemoveCatalog(On_RemoveCatalog typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
