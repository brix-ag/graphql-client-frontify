package ch.brix.gql.client.frontify.builders;

public class UpdateGuidelinePageBlockSettings_block extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.GuidelinePageBlock> {
  public UpdateGuidelinePageBlockSettings_block() {
    super(new ch.brix.gql.client.Call<>("block", "GuidelinePageBlock"));
  }
  public UpdateGuidelinePageBlockSettings_block onGuidelinePageBlock(On_GuidelinePageBlock typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
