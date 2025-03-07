package ch.brix.gql.client.frontify.builders;

public class WorkspaceRootFolder_subFolders extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.SubFolderItems> {
  public WorkspaceRootFolder_subFolders() {
    super(new ch.brix.gql.client.Call<>("subFolders", "SubFolderItems"));
  }
  public WorkspaceRootFolder_subFolders args(WorkspaceRootFolder_subFolders_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public WorkspaceRootFolder_subFolders onSubFolderItems(On_SubFolderItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
