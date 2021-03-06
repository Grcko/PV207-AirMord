package example.createorder;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Order implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Weight in kg")
   private Double weight;
   @org.kie.api.definition.type.Label("Delivery address")
   private java.lang.String deliveryAddress;

   @org.kie.api.definition.type.Label(value = "length")
   private java.lang.Integer length;

   @org.kie.api.definition.type.Label(value = "width")
   private java.lang.Integer width;

   @org.kie.api.definition.type.Label(value = "height")
   private java.lang.Integer height;

   public Order()
   {
   }

   public java.lang.String getDeliveryAddress()
   {
      return this.deliveryAddress;
   }

   public void setDeliveryAddress(java.lang.String deliveryAddress)
   {
      this.deliveryAddress = deliveryAddress;
   }

   public java.lang.Double getWeight()
   {
      return this.weight;
   }

   public void setWeight(java.lang.Double weight)
   {
      this.weight = weight;
   }

   public java.lang.Integer getLength()
   {
      return this.length;
   }

   public void setLength(java.lang.Integer length)
   {
      this.length = length;
   }

   public java.lang.Integer getWidth()
   {
      return this.width;
   }

   public void setWidth(java.lang.Integer width)
   {
      this.width = width;
   }

   public java.lang.Integer getHeight()
   {
      return this.height;
   }

   public void setHeight(java.lang.Integer height)
   {
      this.height = height;
   }

   public Order(java.lang.Double weight, java.lang.String deliveryAddress,
         java.lang.Integer length, java.lang.Integer width,
         java.lang.Integer height)
   {
      this.weight = weight;
      this.deliveryAddress = deliveryAddress;
      this.length = length;
      this.width = width;
      this.height = height;
   }
   
   

}