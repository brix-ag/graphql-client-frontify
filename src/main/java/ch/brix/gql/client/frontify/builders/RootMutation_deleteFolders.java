package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteFolders extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.DeleteFolders> {
  public RootMutation_deleteFolders() {
    super(new ch.brix.gql.client.Call<>("deleteFolders", "DeleteFolders"));
  }
  public RootMutation_deleteFolders args(RootMutation_deleteFolders_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_deleteFolders onDeleteFolders(On_DeleteFolders typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
