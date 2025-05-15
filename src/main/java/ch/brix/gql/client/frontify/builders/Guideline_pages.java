package ch.brix.gql.client.frontify.builders;

public class Guideline_pages extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.GuidelinePageItems> {
  public Guideline_pages() {
    super(new ch.brix.gql.client.Call<>("pages", "GuidelinePageItems"));
  }
  public Guideline_pages args(Guideline_pages_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Guideline_pages onGuidelinePageItems(On_GuidelinePageItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
