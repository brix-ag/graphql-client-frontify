package ch.brix.gql.client.frontify.builders;

public class DeleteGuidelinePageSectionReferenced_references extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.GuidelinePageBlockLocation>> {
  public DeleteGuidelinePageSectionReferenced_references() {
    super(new ch.brix.gql.client.Call<>("references", "GuidelinePageBlockLocation"));
  }
  public DeleteGuidelinePageSectionReferenced_references onGuidelinePageBlockLocation(On_GuidelinePageBlockLocation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
