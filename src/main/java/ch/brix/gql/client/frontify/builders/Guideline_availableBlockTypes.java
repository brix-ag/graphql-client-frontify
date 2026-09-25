package ch.brix.gql.client.frontify.builders;

public class Guideline_availableBlockTypes extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.GuidelinePageBlockType>> {
  public Guideline_availableBlockTypes() {
    super(new ch.brix.gql.client.Call<>("availableBlockTypes", "GuidelinePageBlockType"));
  }
  public Guideline_availableBlockTypes onGuidelinePageBlockType(On_GuidelinePageBlockType typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
