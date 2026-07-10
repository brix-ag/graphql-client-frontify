package ch.brix.gql.client.frontify.builders;

public class File_variants extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetVariantItems> {
  public File_variants() {
    super(new ch.brix.gql.client.Call<>("variants", "AssetVariantItems"));
  }
  public File_variants args(File_variants_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public File_variants onAssetVariantItems(On_AssetVariantItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
