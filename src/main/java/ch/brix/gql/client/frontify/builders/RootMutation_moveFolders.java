package ch.brix.gql.client.frontify.builders;

public class RootMutation_moveFolders extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.MoveFolders> {
  public RootMutation_moveFolders() {
    super(new ch.brix.gql.client.Call<>("moveFolders", "MoveFolders"));
  }
  public RootMutation_moveFolders args(RootMutation_moveFolders_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_moveFolders onMoveFolders(On_MoveFolders typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
