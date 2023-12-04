package ch.brix.gql.client.frontify.builders;

public class SimpleMarking_dimensions extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.MarkingDimensions> {
  public SimpleMarking_dimensions() {
    super(new ch.brix.gql.client.Call<>("dimensions", "MarkingDimensions"));
  }
  public SimpleMarking_dimensions onMarkingDimensions(On_MarkingDimensions typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
