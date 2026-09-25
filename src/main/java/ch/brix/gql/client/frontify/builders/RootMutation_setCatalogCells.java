package ch.brix.gql.client.frontify.builders;

public class RootMutation_setCatalogCells extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.SetCatalogCells> {
  public RootMutation_setCatalogCells() {
    super(new ch.brix.gql.client.Call<>("setCatalogCells", "SetCatalogCells"));
  }
  public RootMutation_setCatalogCells args(RootMutation_setCatalogCells_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_setCatalogCells onSetCatalogCells(On_SetCatalogCells typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
