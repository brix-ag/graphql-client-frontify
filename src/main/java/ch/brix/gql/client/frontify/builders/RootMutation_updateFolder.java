package ch.brix.gql.client.frontify.builders;

public class RootMutation_updateFolder extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.UpdateFolder> {
  public RootMutation_updateFolder() {
    super(new ch.brix.gql.client.Call<>("updateFolder", "UpdateFolder"));
  }
  public RootMutation_updateFolder args(RootMutation_updateFolder_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_updateFolder onUpdateFolder(On_UpdateFolder typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
