package ch.brix.gql.client.frontify.builders;

public class WorkspaceRootFolder_folders extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.FolderItems> {
  public WorkspaceRootFolder_folders() {
    super(new ch.brix.gql.client.Call<>("folders", "FolderItems"));
  }
  public WorkspaceRootFolder_folders args(WorkspaceRootFolder_folders_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public WorkspaceRootFolder_folders onFolderItems(On_FolderItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
