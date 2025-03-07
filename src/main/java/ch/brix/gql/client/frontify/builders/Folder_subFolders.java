package ch.brix.gql.client.frontify.builders;

public class Folder_subFolders extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.SubFolderItems> {
  public Folder_subFolders() {
    super(new ch.brix.gql.client.Call<>("subFolders", "SubFolderItems"));
  }
  public Folder_subFolders args(Folder_subFolders_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Folder_subFolders onSubFolderItems(On_SubFolderItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
