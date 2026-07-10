package ch.brix.gql.client.frontify.builders;

public class Video_revisions extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetRevisionItems> {
  public Video_revisions() {
    super(new ch.brix.gql.client.Call<>("revisions", "AssetRevisionItems"));
  }
  public Video_revisions args(Video_revisions_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Video_revisions onAssetRevisionItems(On_AssetRevisionItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
