package ch.brix.gql.client.frontify.builders;

public class SubFolder_subFolders extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.SubFolderItems> {
  public SubFolder_subFolders() {
    super(new ch.brix.gql.client.Call<>("subFolders", "SubFolderItems"));
  }
  public SubFolder_subFolders args(SubFolder_subFolders_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public SubFolder_subFolders onSubFolderItems(On_SubFolderItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
