package ch.brix.gql.client.frontify.builders;

public class Video_attachments extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.AssetAttachment>> {
  public Video_attachments() {
    super(new ch.brix.gql.client.Call<>("attachments", "AssetAttachment"));
  }
  public Video_attachments onAssetAttachment(On_AssetAttachment typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
