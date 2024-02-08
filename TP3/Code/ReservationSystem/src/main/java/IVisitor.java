public interface IVisitor {

	/**
	 * 
	 * @param Plane
	 */
	void visitPlane(int Plane);

	/**
	 * 
	 * @param Train
	 */
	void visitTrain(int Train);

	/**
	 * 
	 * @param Boat
	 */
	void visitBoat(int Boat);

}