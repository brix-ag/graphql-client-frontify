package ch.brix.gql.client.frontify.builders;

public class RootMutation_createFolder extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreateFolder> {
  public RootMutation_createFolder() {
    super(new ch.brix.gql.client.Call<>("createFolder", "CreateFolder"));
  }
  public RootMutation_createFolder args(RootMutation_createFolder_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_createFolder onCreateFolder(On_CreateFolder typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
