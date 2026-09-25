package ch.brix.gql.client.frontify.builders;

public class RootMutation_moveCatalogColumn extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.MoveCatalogColumn> {
  public RootMutation_moveCatalogColumn() {
    super(new ch.brix.gql.client.Call<>("moveCatalogColumn", "MoveCatalogColumn"));
  }
  public RootMutation_moveCatalogColumn args(RootMutation_moveCatalogColumn_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_moveCatalogColumn onMoveCatalogColumn(On_MoveCatalogColumn typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
