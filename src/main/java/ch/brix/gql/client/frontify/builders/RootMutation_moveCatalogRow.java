package ch.brix.gql.client.frontify.builders;

public class RootMutation_moveCatalogRow extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.MoveCatalogRow> {
  public RootMutation_moveCatalogRow() {
    super(new ch.brix.gql.client.Call<>("moveCatalogRow", "MoveCatalogRow"));
  }
  public RootMutation_moveCatalogRow args(RootMutation_moveCatalogRow_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_moveCatalogRow onMoveCatalogRow(On_MoveCatalogRow typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
