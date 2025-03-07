package ch.brix.gql.client.frontify.builders;

public class MultiPageMarking_dimensions extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.MarkingDimensions> {
  public MultiPageMarking_dimensions() {
    super(new ch.brix.gql.client.Call<>("dimensions", "MarkingDimensions"));
  }
  public MultiPageMarking_dimensions onMarkingDimensions(On_MarkingDimensions typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
