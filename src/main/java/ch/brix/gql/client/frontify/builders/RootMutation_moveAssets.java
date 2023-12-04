package ch.brix.gql.client.frontify.builders;

public class RootMutation_moveAssets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.MoveAssets> {
  public RootMutation_moveAssets() {
    super(new ch.brix.gql.client.Call<>("moveAssets", "MoveAssets"));
  }
  public RootMutation_moveAssets args(RootMutation_moveAssets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_moveAssets onMoveAssets(On_MoveAssets typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
